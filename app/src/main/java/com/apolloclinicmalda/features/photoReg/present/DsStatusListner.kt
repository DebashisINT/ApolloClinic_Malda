package com.apolloclinicmalda.features.photoReg.present

import com.apolloclinicmalda.app.domain.ProspectEntity
import com.apolloclinicmalda.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}