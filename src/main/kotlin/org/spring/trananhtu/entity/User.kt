package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class User(
    @Id
    val id: Long = 0,
    val name: String = "",
    val role: String = "",
    val email: String = "",
    val phone: String = "",
    val password: String = "",
    val cart: String = "",
    val address: String = "",
) {
}