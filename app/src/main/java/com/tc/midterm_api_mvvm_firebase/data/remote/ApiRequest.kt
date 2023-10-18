package com.tc.midterm_api_mvvm_firebase.data.remote

import com.tc.midterm_api_mvvm_firebase.data.model.satscore.SatListItemModel
import com.tc.midterm_api_mvvm_firebase.data.model.school.SchoolListItemModel
import retrofit2.http.GET

interface ApiRequest {
    @GET(ApiDetails.SCHOOL_ENDPOINT)
    suspend fun getSchools():List<SchoolListItemModel>
    //suspend -> pauses functionality until resources become available
    //helps run in the background
    //required to run in coroutines

    @GET(ApiDetails.SAT_ENDPOINT)
    suspend fun getSatScore(dbn: String):List<SatListItemModel>
}