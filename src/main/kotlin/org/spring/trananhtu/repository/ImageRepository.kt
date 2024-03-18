package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.Image
import org.springframework.data.repository.CrudRepository

interface ImageRepository : CrudRepository<Image, Long> {
}