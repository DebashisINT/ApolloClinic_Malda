package com.apolloclinicmalda.features.activities.api

import com.apolloclinicmalda.features.member.api.TeamApi
import com.apolloclinicmalda.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}