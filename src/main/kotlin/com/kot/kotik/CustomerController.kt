package com.kot.kotik

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/searchByName/{name}")
    fun findByLastName(@PathVariable name: String) = repository.findByLastName(name)

    @GetMapping("/foo")
    fun foo() = "hello foo World"
}