package io.github.simplydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class LottoServiceApplication

fun main(args: Array<String>) {
	runApplication<LottoServiceApplication>(*args)
}
