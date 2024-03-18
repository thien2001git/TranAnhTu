package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.BillDetail
import org.springframework.data.repository.CrudRepository

interface BillDetailRepository : CrudRepository<BillDetail, Long> {
}