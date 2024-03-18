package org.spring.trananhtu.repository

import org.spring.trananhtu.entity.Comment
import org.springframework.data.repository.CrudRepository

interface CommentRepository : CrudRepository<Comment, Long> {
}