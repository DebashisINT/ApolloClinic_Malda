package com.apolloclinicmalda.features.viewAllOrder.interf

import com.apolloclinicmalda.app.domain.NewOrderGenderEntity
import com.apolloclinicmalda.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}