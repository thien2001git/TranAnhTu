package org.spring.trananhtu.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class BillDetail(
    @Id
    val id: Long = 0,
    val idBill: Long = 0,
    val product: Long = 0,
    val number: Int = 0,
)