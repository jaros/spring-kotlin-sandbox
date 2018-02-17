package com.kot.kotik

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.*

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface CustomerRepository : PagingAndSortingRepository<Customer, Long> {
    fun findByLastName(@Param("name") name: String): List<Customer>
    fun findById(id: Long): Optional<Customer>
}