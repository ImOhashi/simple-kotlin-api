package com.ohashi.simplekotlinapi.services

import com.ohashi.simplekotlinapi.domain.entities.Message
import com.ohashi.simplekotlinapi.repositories.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }
}