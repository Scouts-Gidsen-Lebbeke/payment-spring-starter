package be.sgl.payment.boot.configurations

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "payment.providers")
class PaymentProviderConfigurationProperties {

    lateinit var mollie: MollieConfigurationProperties
    lateinit var payconiq: PaymentProviderConfigurationProperties

    class MollieConfigurationProperties {
        val enabled = false
        val apiKey: String? = null
    }

    class PayconiqConfigurationProperties {
        val enabled = false
        val apiKey: String? = null
    }
}