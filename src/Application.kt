package com.arifahmadalfian

import com.arifahmadalfian.plugins.*
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
fun Application.module() {
    configureKoin()
    configureSockets()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
}





