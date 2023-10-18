package com.tc.midterm_api_mvvm_firebase.data.repository

import com.tc.midterm_api_mvvm_firebase.data.model.satscore.SatListItemModel
import com.tc.midterm_api_mvvm_firebase.data.model.school.SchoolListItemModel
import com.tc.midterm_api_mvvm_firebase.data.remote.ApiRequest
import javax.inject.Inject

class RepositoryImpl @Inject constructor(val api: ApiRequest) :Repository{
    override suspend fun getSchools():List<SchoolListItemModel>{
        return api.getSchools()
    }

    override suspend fun getSatScore(dbn: String):List<SatListItemModel>{
        return api.getSatScore(dbn)
    }
}