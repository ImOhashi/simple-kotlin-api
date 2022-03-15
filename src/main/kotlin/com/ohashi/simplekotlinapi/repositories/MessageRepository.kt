package com.ohashi.simplekotlinapi.repositories

import com.ohashi.simplekotlinapi.domain.entities.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {

    @Query("select * from messages")
    fun findMessages(): List<Message>
}