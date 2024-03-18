package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository: CrudRepository<Category, Long> {
}