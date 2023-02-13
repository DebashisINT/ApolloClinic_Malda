package com.apolloclinicmalda.features.viewAllOrder.interf

import com.apolloclinicmalda.app.domain.NewOrderProductEntity
import com.apolloclinicmalda.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}