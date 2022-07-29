package com.brenthaertlein.demo.rhoscpp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RhoscppApplication

fun main(args: Array<String>) {
	runApplication<RhoscppApplication>(*args)
}
