package io.dev.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import io.dev.model.CompanyOverview
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
class FinanceController {

    var mapper: ObjectMapper = jacksonObjectMapper().registerModule(KotlinModule())

    @GetMapping("/api/companyData")
    fun companyData(@RequestParam("name") company: String): CompanyOverview? {

        val url = "https://www.alphavantage.co/query?function=OVERVIEW&symbol=$company&apikey=MJJOQAOKEG01QH2M"
        val data = RestTemplate().getForObject(url, String::class.java);

        return mapper.readValue(data, CompanyOverview::class.java);
    }
}