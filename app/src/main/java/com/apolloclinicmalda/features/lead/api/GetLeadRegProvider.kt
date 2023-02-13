package com.apolloclinicmalda.features.lead.api

import com.apolloclinicmalda.features.NewQuotation.api.GetQuotListRegRepository
import com.apolloclinicmalda.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}