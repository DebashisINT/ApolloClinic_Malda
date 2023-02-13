package com.apolloclinicmalda.features.viewAllOrder.interf

import com.apolloclinicmalda.app.domain.NewOrderGenderEntity
import com.apolloclinicmalda.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}