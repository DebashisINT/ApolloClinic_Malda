package com.apolloclinicmalda.features.viewAllOrder.model

import com.apolloclinicmalda.app.domain.NewOrderColorEntity
import com.apolloclinicmalda.app.domain.NewOrderGenderEntity
import com.apolloclinicmalda.app.domain.NewOrderProductEntity
import com.apolloclinicmalda.app.domain.NewOrderSizeEntity
import com.apolloclinicmalda.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

