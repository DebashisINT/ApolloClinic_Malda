package com.apolloclinicmalda.features.document.api

import com.apolloclinicmalda.features.dymanicSection.api.DynamicApi
import com.apolloclinicmalda.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}