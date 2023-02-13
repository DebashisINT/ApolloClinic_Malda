package com.apolloclinicmalda.features.location.api

import com.apolloclinicmalda.features.location.shopdurationapi.ShopDurationApi
import com.apolloclinicmalda.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}