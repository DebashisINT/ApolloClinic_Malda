package com.apolloclinicmalda.features.lead.api

import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.NewQuotation.model.AddQuotRequestData
import com.apolloclinicmalda.features.lead.model.*
import io.reactivex.Observable

class GetLeadListRegRepository(val apiService : GetLeadListApi) {
    fun CustomerList(list: CustomerListReq): Observable<CustomerLeadResponse> {
        return apiService.getCustomerList(list)
    }

    fun submitActivity(list: AddActivityReq): Observable<BaseResponse> {
        return apiService.submitActivityListAPI(list)
    }

    fun editActivity(obj: EditActivityReq): Observable<BaseResponse> {
        return apiService.editActivityAPI(obj)
    }


    fun getActivityList(crm_id: String): Observable<ActivityViewRes> {
        return apiService.viewActivityList(crm_id)
    }

}