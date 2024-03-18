package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Image(
    @Id
    val id: Long = 0,
    val path: String = "",
) {
}