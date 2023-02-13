package com.apolloclinicmalda.features.dashboard.presentation.api.dayStartEnd

import com.apolloclinicmalda.features.stockCompetetorStock.api.AddCompStockApi
import com.apolloclinicmalda.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}