package com.arifahmadalfian.plugins

import com.arifahmadalfian.di.mainModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin

fun Application.configureKoin() {
    install(Koin) {
        modules(mainModule)
    }
}