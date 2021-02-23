package com.example.androidwwo.model

interface UseCase <P, R> {
    fun execute(params: P): R
}

interface Cancellable {
    fun cancel()
}