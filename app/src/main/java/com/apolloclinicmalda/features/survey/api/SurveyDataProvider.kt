package com.apolloclinicmalda.features.survey.api

import com.apolloclinicmalda.features.photoReg.api.GetUserListPhotoRegApi
import com.apolloclinicmalda.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}