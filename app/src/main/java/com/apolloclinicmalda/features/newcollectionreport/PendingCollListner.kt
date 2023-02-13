package com.apolloclinicmalda.features.newcollectionreport

import com.apolloclinicmalda.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}