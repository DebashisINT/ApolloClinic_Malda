package com.apolloclinicmalda.features.nearbyuserlist.api

import com.apolloclinicmalda.app.Pref
import com.apolloclinicmalda.features.nearbyuserlist.model.NearbyUserResponseModel
import com.apolloclinicmalda.features.newcollection.model.NewCollectionListResponseModel
import com.apolloclinicmalda.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}