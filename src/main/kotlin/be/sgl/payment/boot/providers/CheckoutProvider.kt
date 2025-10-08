package be.sgl.payment.boot.providers

import be.sgl.payment.boot.core.Customer
import be.sgl.payment.boot.core.Payment
import be.sgl.payment.boot.core.SimplifiedPaymentStatus

interface CheckoutProvider {
    fun createRedirectUrl(payment: Payment, domain: String, payableId: Int?): String
    fun createCheckoutUrl(customer: Customer, payment: Payment, domain: String, payableId: Int?): String
    fun getCheckoutUrl(payment: Payment): String
    fun getPaymentStatusById(paymentId: String): SimplifiedPaymentStatus
    fun refundPayment(payment: Payment)
    fun getRefundCost(payment: Payment) = 1.0
}