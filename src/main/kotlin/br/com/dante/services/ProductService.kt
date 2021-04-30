package br.com.dante.services

import br.com.dante.FindProductRequest
import br.com.dante.ProductResponse
import javax.inject.Singleton

@Singleton
class ProductService {

    fun getProduct(request : FindProductRequest) : ProductResponse {
        return ProductResponse.newBuilder()
            .setId(request.id)
            .setName("Caixa JBL")
            .setValue(100.00)
            .build();
    }

}