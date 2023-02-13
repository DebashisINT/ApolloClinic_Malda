package com.apolloclinicmalda.features.orderList.model

import com.apolloclinicmalda.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}