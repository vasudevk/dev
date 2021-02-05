package io.dev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinDevApplication

fun main(args: Array<String>) {
    runApplication<KotlinDevApplication>(*args)
}