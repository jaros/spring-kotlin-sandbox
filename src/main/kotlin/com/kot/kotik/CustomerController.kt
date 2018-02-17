package com.kot.kotik

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/foo")
    fun foo() = "hello foo World"
}