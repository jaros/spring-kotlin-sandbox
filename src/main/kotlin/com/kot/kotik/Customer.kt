package com.kot.kotik

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Customer(
        val firstName: String = "",
        val lastName: String = "",
        @Id @GeneratedValue
        val id: Long = -1)