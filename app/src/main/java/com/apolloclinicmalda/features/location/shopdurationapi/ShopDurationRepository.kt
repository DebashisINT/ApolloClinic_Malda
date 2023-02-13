package com.apolloclinicmalda.features.location.shopdurationapi

import com.apolloclinicmalda.app.Pref
import com.apolloclinicmalda.app.utils.AppUtils
import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.location.model.MeetingDurationInputParams
import com.apolloclinicmalda.features.location.model.ShopDurationRequest
import com.apolloclinicmalda.features.location.model.VisitRemarksResponseModel
import com.elvishew.xlog.XLog
import io.reactivex.Observable

/**
 * Created by Pratishruti on 29-11-2017.
 */
class ShopDurationRepository(val apiService: ShopDurationApi) {
    fun shopDuration(shopDuration: ShopDurationRequest?): Observable<ShopDurationRequest> {
        XLog.d("ShopDurationRepository shop_visit_api_call"+AppUtils.getCurrentDateTime().toString()+"\ndata - "+shopDuration.toString())
        return apiService.submitShopDuration(shopDuration)
    }

    fun meetingDuration(meetingDuration: MeetingDurationInputParams?): Observable<BaseResponse> {
        return apiService.submitMeetingDuration(meetingDuration)
    }

    fun getRemarksList(): Observable<VisitRemarksResponseModel> {
        return apiService.getRemarksList(Pref.session_token!!, Pref.user_id!!)
    }
}