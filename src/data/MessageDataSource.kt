package com.arifahmadalfian.data

import com.arifahmadalfian.data.model.Message
import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSource(
    private val db: CoroutineDatabase
): IMessageDataSource {

    private val messages = db.getCollection<Message>()

    override suspend fun getAllMessage(): List<Message> {
        return messages.find()
            .descendingSort(Message::timestamp)
            .toList()
    }

    override suspend fun insertMessage(message: Message) {
        messages.insertOne(message)
    }
}