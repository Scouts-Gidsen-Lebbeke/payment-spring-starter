package be.sgl.payment.boot.configurations

import be.woutschoovaerts.mollie.Client
import be.woutschoovaerts.mollie.ClientBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnProperty("payment.providers.mollie.enabled", havingValue = "true")
@EnableConfigurationProperties(PaymentProviderConfigurationProperties::class)
class MollieConfiguration {

    @Autowired
    private lateinit var configuration: PaymentProviderConfigurationProperties

    @Bean
    fun mollieApiClient(): Client {
        return ClientBuilder().withApiKey(configuration.mollie.apiKey).build()
    }
}