package com.apolloclinicmalda.features.stockCompetetorStock.api

import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.orderList.model.NewOrderListResponseModel
import com.apolloclinicmalda.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.apolloclinicmalda.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}