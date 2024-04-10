package com.virtualreceptionist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VirtualReceptionistApiApplication

fun main(args: Array<String>) {
    runApplication<VirtualReceptionistApiApplication>(*args)
}
