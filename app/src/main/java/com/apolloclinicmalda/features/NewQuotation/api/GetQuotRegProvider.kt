package com.apolloclinicmalda.features.NewQuotation.api



object GetQuotRegProvider {

    fun provideSaveButton(): GetQuotListRegRepository {
        return GetQuotListRegRepository(GetQutoListApi.create())
    }


}