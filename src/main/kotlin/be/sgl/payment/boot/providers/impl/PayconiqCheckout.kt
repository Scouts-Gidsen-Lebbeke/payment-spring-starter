package be.sgl.payment.boot.providers.impl

import be.sgl.payment.boot.core.Customer
import be.sgl.payment.boot.core.Payment
import be.sgl.payment.boot.core.SimplifiedPaymentStatus
import be.sgl.payment.boot.providers.CheckoutProvider

class PayconiqCheckout : CheckoutProvider {

    override fun createRedirectUrl(payment: Payment, domain: String, payableId: Int?): String {
        TODO("Not yet implemented")
    }

    override fun createCheckoutUrl(customer: Customer, payment: Payment, domain: String, payableId: Int?): String {
        TODO("Not yet implemented")
    }

    override fun getCheckoutUrl(payment: Payment): String {
        TODO("Not yet implemented")
    }

    override fun getPaymentStatusById(paymentId: String): SimplifiedPaymentStatus {
        TODO("Not yet implemented")
    }

    override fun refundPayment(payment: Payment) {
        TODO("Not yet implemented")
    }
}