package com.edigest.TodoApp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Todo {
    @GetMapping
    fun sayHello(): String {
        return "hello world"
    }
}
