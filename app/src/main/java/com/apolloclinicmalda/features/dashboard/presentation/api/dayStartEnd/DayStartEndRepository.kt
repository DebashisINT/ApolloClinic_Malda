package com.apolloclinicmalda.features.dashboard.presentation.api.dayStartEnd

import com.apolloclinicmalda.app.Pref
import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.dashboard.presentation.model.DaystartDayendRequest
import com.apolloclinicmalda.features.dashboard.presentation.model.StatusDayStartEnd
import com.apolloclinicmalda.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.apolloclinicmalda.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}