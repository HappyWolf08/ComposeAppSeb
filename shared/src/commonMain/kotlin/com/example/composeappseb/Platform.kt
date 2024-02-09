package com.example.composeappseb

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform