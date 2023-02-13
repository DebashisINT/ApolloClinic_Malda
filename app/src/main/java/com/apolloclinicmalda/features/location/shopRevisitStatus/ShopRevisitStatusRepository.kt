package com.apolloclinicmalda.features.location.shopRevisitStatus

import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.location.model.ShopDurationRequest
import com.apolloclinicmalda.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}