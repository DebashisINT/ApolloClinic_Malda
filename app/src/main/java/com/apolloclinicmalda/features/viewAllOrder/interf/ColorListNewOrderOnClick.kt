package com.apolloclinicmalda.features.viewAllOrder.interf

import com.apolloclinicmalda.app.domain.NewOrderColorEntity
import com.apolloclinicmalda.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}