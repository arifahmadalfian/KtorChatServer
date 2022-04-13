package com.arifahmadalfian.di

import com.arifahmadalfian.data.IMessageDataSource
import com.arifahmadalfian.data.MessageDataSource
import com.arifahmadalfian.room.RoomController
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

val mainModule = module {
    single {
        KMongo.createClient()
            .coroutine
            .getDatabase("message_db")
    }
    single<IMessageDataSource> {
        MessageDataSource(get())
    }
    single {
        RoomController(get())
    }
}