package com.github.solairerove.k8s.hello.world

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootK8sHelloWorldApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootK8sHelloWorldApplication::class.java, *args)
}
