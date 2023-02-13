package com.apolloclinicmalda.features.login.model.productlistmodel

import com.apolloclinicmalda.app.domain.ModelEntity
import com.apolloclinicmalda.app.domain.ProductListEntity
import com.apolloclinicmalda.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}