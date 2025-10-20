package be.sgl.payment.boot

import be.sgl.payment.boot.core.Customer
import be.sgl.payment.boot.core.Payment
import be.sgl.payment.boot.providers.impl.MollieCheckout
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class MollieCheckoutIntegrationTest {

    @Autowired
    private lateinit var mollieCheckout: MollieCheckout

    @Test
    fun testCreatePayment() {
        // given
        val customer = Customer("John Doe", "john@doe.com")
        val payment = Payment()

        // when
        mollieCheckout.createCheckoutUrl(customer, payment)
    }
}