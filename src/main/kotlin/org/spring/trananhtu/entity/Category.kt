package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Category(
    @Id
    val id: Long = 0,
    val name: String = "",
)