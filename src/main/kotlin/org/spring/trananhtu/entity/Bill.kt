package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Bill(
    @Id
    val id: Long = 0,
    val user: Long = 0,
    val address: String = ""
) {
}