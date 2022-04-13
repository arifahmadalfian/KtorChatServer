package com.arifahmadalfian.plugins

import com.arifahmadalfian.room.RoomController
import com.arifahmadalfian.routes.chatSocket
import com.arifahmadalfian.routes.getAllMessages
import io.ktor.application.*
import io.ktor.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}