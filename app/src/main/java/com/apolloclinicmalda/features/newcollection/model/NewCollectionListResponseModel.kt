package com.apolloclinicmalda.features.newcollection.model

import com.apolloclinicmalda.app.domain.CollectionDetailsEntity
import com.apolloclinicmalda.base.BaseResponse
import com.apolloclinicmalda.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}