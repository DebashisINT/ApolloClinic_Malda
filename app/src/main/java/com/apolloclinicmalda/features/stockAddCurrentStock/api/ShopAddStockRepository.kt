package com.apolloclinicmalda.features.stockAddCurrentStock.api

import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.location.model.ShopRevisitStatusRequest
import com.apolloclinicmalda.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.apolloclinicmalda.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.apolloclinicmalda.features.stockAddCurrentStock.model.CurrentStockGetData
import com.apolloclinicmalda.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}