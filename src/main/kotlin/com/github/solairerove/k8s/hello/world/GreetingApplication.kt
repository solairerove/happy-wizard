package com.github.solairerove.k8s.hello.world

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class GreetingApplication

fun main(args: Array<String>) {
    SpringApplication.run(GreetingApplication::class.java, *args)
}
