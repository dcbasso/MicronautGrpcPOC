package br.com.dante.endpoints

import br.com.dante.FindProductRequest
import br.com.dante.ProductResponse
import br.com.dante.ProductServiceGrpcKt
import br.com.dante.services.ProductService
import javax.inject.Singleton

@Singleton
class ProductEndpoint(val productService: ProductService) : ProductServiceGrpcKt.ProductServiceCoroutineImplBase() {

    override suspend fun getProduct(request: FindProductRequest): ProductResponse {
        return productService.getProduct(request)
    }
}