package com.github.solairerove.k8s.hello.world

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

/**
 * Greeting rest controller.
 */
@RestController
class GreetingController {

    private val counter = AtomicInteger()

    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "World") name: String) =
            HelloResponse.aHelloResponse(counter.incrementAndGet(), name)!!
}
