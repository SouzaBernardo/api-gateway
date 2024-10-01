package muppet.hellokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HellokotlinApplication

fun main(args: Array<String>) {
    runApplication<HellokotlinApplication>(*args)
}

@RestController
@RequestMapping("/helloworld")
class HelloKotlinController {
    @GetMapping
    fun helloKotlin() = "Hello, Kotlin!"
}