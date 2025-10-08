package be.sgl.payment.boot.core

interface Payment {
    var id: String?
    var paid: Boolean
    var price: Double
    var paymentId: String?

    fun getDescription(): String

    fun markPaid() = apply {
        paid = true
    }

    fun markRefunded() = apply {
        paid = false
    }
}