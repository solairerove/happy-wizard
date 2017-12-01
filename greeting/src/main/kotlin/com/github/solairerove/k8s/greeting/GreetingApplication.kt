package com.github.solairerove.k8s.greeting

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class GreetingApplication

fun main(args: Array<String>) {
    SpringApplication.run(GreetingApplication::class.java, *args)
}
