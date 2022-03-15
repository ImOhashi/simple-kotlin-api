package com.ohashi.simplekotlinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleKotlinApiApplication

fun main(args: Array<String>) {
	runApplication<SimpleKotlinApiApplication>(*args)
}
