package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {
}