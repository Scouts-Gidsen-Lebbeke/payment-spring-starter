package be.sgl.payment.boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymentSpringStarterApplication

fun main(args: Array<String>) {
	runApplication<PaymentSpringStarterApplication>(*args)
}
