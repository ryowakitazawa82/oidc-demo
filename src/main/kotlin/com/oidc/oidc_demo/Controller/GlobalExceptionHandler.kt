package com.oidc.oidc_demo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(java.lang.Exception::class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    fun handleException(e: java.lang.Exception): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Custom error: " + e.message)
    }
}