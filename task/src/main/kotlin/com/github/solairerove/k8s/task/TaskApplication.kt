package com.github.solairerove.k8s.task

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableDiscoveryClient
class TaskApplication {
    @Bean
    fun init(repository: TaskRepository) = CommandLineRunner {
        repository.save(Task("Jack", "Bauer"))
        repository.save(Task("Chloe", "O'Brian"))
        repository.save(Task("Kim", "Bauer"))
        repository.save(Task("David", "Palmer"))
        repository.save(Task("Michelle", "Dessler"))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TaskApplication::class.java, *args)
}
