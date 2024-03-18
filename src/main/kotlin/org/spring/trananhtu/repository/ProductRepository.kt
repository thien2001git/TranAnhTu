package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.Product
import org.springframework.data.repository.CrudRepository

interface ProductRepository : CrudRepository<Product, Long> {
}