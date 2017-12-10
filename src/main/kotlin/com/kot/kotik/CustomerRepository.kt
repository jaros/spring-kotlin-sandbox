package com.kot.kotik

import org.springframework.data.repository.CrudRepository
import java.util.*

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(name: String): List<Customer>
    fun findById(id: Long): Optional<Customer>
}