package io.dev.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CompanyOverview(

        @field:JsonProperty("Address")
        val address: String,

        @field:JsonProperty("ForwardAnnualDividendYield")
        val forwardAnnualDividendYield: String,

        @field:JsonProperty("EBITDA")
        val eBITDA: String,

        @field:JsonProperty("EPS")
        val ePS: String,

        @field:JsonProperty("ShortPercentOutstanding")
        val shortPercentOutstanding: String,

        @field:JsonProperty("ExDividendDate")
        val exDividendDate: String,

        @field:JsonProperty("Name")
        val name: String,

        @field:JsonProperty("Beta")
        val beta: String,

        @field:JsonProperty("Industry")
        val industry: String,

        @field:JsonProperty("FiscalYearEnd")
        val fiscalYearEnd: String,

        @field:JsonProperty("EVToEBITDA")
        val eVToEBITDA: String,

        @field:JsonProperty("AnalystTargetPrice")
        val analystTargetPrice: String,

        @field:JsonProperty("Currency")
        val currency: String,

        @field:JsonProperty("PriceToSalesRatioTTM")
        val priceToSalesRatioTTM: String,

        @field:JsonProperty("52WeekLow")
        val jsonMember52WeekLow: String,

        @field:JsonProperty("DilutedEPSTTM")
        val dilutedEPSTTM: String,

        @field:JsonProperty("QuarterlyEarningsGrowthYOY")
        val quarterlyEarningsGrowthYOY: String,

        @field:JsonProperty("ProfitMargin")
        val profitMargin: String,

        @field:JsonProperty("ForwardPE")
        val forwardPE: String,

        @field:JsonProperty("LastSplitFactor")
        val lastSplitFactor: String,

        @field:JsonProperty("LatestQuarter")
        val latestQuarter: String,

        @field:JsonProperty("TrailingPE")
        val trailingPE: String,

        @field:JsonProperty("RevenueTTM")
        val revenueTTM: String,

        @field:JsonProperty("QuarterlyRevenueGrowthYOY")
        val quarterlyRevenueGrowthYOY: String,

        @field:JsonProperty("ReturnOnAssetsTTM")
        val returnOnAssetsTTM: String,

        @field:JsonProperty("Exchange")
        val exchange: String,

        @field:JsonProperty("PriceToBookRatio")
        val priceToBookRatio: String,

        @field:JsonProperty("Country")
        val country: String,

        @field:JsonProperty("MarketCapitalization")
        val marketCapitalization: String,

        @field:JsonProperty("50DayMovingAverage")
        val jsonMember50DayMovingAverage: String,

        @field:JsonProperty("52WeekHigh")
        val jsonMember52WeekHigh: String,

        @field:JsonProperty("ReturnOnEquityTTM")
        val returnOnEquityTTM: String,

        @field:JsonProperty("PercentInsiders")
        val percentInsiders: String,

        @field:JsonProperty("Description")
        val description: String,

        @field:JsonProperty("200DayMovingAverage")
        val jsonMember200DayMovingAverage: String,

        @field:JsonProperty("Symbol")
        val symbol: String,

        @field:JsonProperty("PayoutRatio")
        val payoutRatio: String,

        @field:JsonProperty("SharesShort")
        val sharesShort: String,

        @field:JsonProperty("DividendYield")
        val dividendYield: String,

        @field:JsonProperty("ShortPercentFloat")
        val shortPercentFloat: String,

        @field:JsonProperty("FullTimeEmployees")
        val fullTimeEmployees: String,

        @field:JsonProperty("DividendDate")
        val dividendDate: String,

        @field:JsonProperty("EVToRevenue")
        val eVToRevenue: String,

        @field:JsonProperty("GrossProfitTTM")
        val grossProfitTTM: String,

        @field:JsonProperty("OperatingMarginTTM")
        val operatingMarginTTM: String,

        @field:JsonProperty("Sector")
        val sector: String,

        @field:JsonProperty("ShortRatio")
        val shortRatio: String,

        @field:JsonProperty("SharesFloat")
        val sharesFloat: String,

        @field:JsonProperty("ForwardAnnualDividendRate")
        val forwardAnnualDividendRate: String,

        @field:JsonProperty("DividendPerShare")
        val dividendPerShare: String,

        @field:JsonProperty("PercentInstitutions")
        val percentInstitutions: String,

        @field:JsonProperty("RevenuePerShareTTM")
        val revenuePerShareTTM: String,

        @field:JsonProperty("LastSplitDate")
        val lastSplitDate: String,

        @field:JsonProperty("AssetType")
        val assetType: String,

        @field:JsonProperty("BookValue")
        val bookValue: String,

        @field:JsonProperty("PERatio")
        val pERatio: String,

        @field:JsonProperty("SharesOutstanding")
        val sharesOutstanding: String,

        @field:JsonProperty("SharesShortPriorMonth")
        val sharesShortPriorMonth: String,

        @field:JsonProperty("PEGRatio")
        val pEGRatio: String
)
