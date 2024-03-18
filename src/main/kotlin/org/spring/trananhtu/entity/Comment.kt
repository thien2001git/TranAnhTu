package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Comment constructor(
    @Id
    val id: Long = 0,
    val content: String = "",
    val star_number: Int = 0,
) {
}