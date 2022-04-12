package com.arifahmadalfian.data

import com.arifahmadalfian.data.model.Message

interface IMessageDataSource {
    suspend fun getAllMessage(): List<Message>
    suspend fun insertMessage(message: Message)
}