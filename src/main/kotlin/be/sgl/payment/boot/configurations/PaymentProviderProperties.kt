package be.sgl.payment.boot.configurations

import be.sgl.payment.boot.configurations.PaymentProviderProperties.Companion.PREFIX
import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = PREFIX)
class PaymentProviderProperties(
    val baseUrl: String,
    var publicBaseUrl: String
) {
    companion object {
        const val PREFIX = "payment.providers"
    }
}