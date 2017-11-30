package com.github.solairerove.k8s.greeting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Greeting rest controller.
 */
@RestController
class GreetingController {

    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")
}
