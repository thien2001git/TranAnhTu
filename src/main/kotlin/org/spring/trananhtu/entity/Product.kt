package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Product constructor(
    @Id
    val id: Long = 0,
    val name: String = "",
    val gift: String = "",
    val category: String = "",
    val comment: String = "",
    val image: String = "",
    val statistics: String = "",
    val price: Double = 0.0,
    val count: Int = 0,
){
}