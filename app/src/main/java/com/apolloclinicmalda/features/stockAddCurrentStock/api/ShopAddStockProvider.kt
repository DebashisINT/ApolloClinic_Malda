package com.apolloclinicmalda.features.stockAddCurrentStock.api

import com.apolloclinicmalda.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.apolloclinicmalda.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}