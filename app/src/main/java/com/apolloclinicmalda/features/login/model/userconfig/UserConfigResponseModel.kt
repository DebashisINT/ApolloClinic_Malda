package com.apolloclinicmalda.features.login.model.userconfig

import com.apolloclinicmalda.base.BaseResponse

/**
 * Created by Saikat on 14-01-2019.
 */
class UserConfigResponseModel : BaseResponse() {
    var getconfigure: ArrayList<UserConfigDataModel>? = null
}