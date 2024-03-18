package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.Bill
import org.springframework.data.repository.CrudRepository


interface BillRepository : CrudRepository<Bill, Long> {
}