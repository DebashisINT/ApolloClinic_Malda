package com.apolloclinicmalda.features.location.shopRevisitStatus

import com.apolloclinicmalda.features.location.shopdurationapi.ShopDurationApi
import com.apolloclinicmalda.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}