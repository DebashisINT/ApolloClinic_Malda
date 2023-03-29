package com.apolloclinicmalda.features.viewAllOrder.orderOptimized

import com.apolloclinicmalda.app.domain.ProductOnlineRateTempEntity
import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}