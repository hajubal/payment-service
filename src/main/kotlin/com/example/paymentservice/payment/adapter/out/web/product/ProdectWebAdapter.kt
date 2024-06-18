package com.example.paymentservice.payment.adapter.out.web.product

import com.example.paymentservice.common.WebAdapter
import com.example.paymentservice.payment.adapter.out.web.product.client.ProductClient
import com.example.paymentservice.payment.domain.Product
import com.example.paymentservice.payment.application.port.out.LoadProductPort
import reactor.core.publisher.Flux

@WebAdapter
class ProdectWebAdapter(
    private val productClient: ProductClient
) : LoadProductPort {

    override fun getProducts(cartId: Long, productIds: List<Long>): Flux<Product> {
        return productClient.getProducts(cartId, productIds)
    }
}