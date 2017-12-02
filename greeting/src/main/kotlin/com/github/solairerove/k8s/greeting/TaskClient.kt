package com.github.solairerove.k8s.greeting

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("task")
interface TaskClient {

    @GetMapping("/tasks")
    fun tasks(): String
}
