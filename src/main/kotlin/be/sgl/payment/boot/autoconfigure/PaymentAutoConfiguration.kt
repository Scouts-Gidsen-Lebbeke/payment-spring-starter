package be.sgl.payment.boot.autoconfigure

import be.sgl.payment.boot.configurations.PaymentProviderProperties
import be.sgl.payment.boot.configurations.PaymentProviderProperties.Companion.PREFIX
import be.sgl.payment.boot.providers.CheckoutProvider
import be.sgl.payment.boot.providers.impl.MollieCheckout
import be.sgl.payment.boot.utils.WhenNotBlank
import be.woutschoovaerts.mollie.Client
import be.woutschoovaerts.mollie.ClientBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean

@AutoConfiguration
@EnableConfigurationProperties(PaymentProviderProperties::class)
open class PaymentAutoConfiguration {

    @Autowired
    private lateinit var configuration: PaymentProviderProperties

    @Bean
    @WhenNotBlank("$PREFIX.mollie.api-key")
    open fun mollieApiClient(@Value("$PREFIX.mollie.api-key") apiKey: String): Client {
        return ClientBuilder().withApiKey(apiKey).build()
    }

    @Bean
    @ConditionalOnBean(Client::class)
    open fun mollieCheckout(client: Client): CheckoutProvider {
        return MollieCheckout(client, configuration.baseUrl, configuration.publicBaseUrl)
    }
}