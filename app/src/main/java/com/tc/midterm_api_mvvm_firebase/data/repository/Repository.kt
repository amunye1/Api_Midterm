package com.tc.midterm_api_mvvm_firebase.data.repository

import com.tc.midterm_api_mvvm_firebase.data.model.satscore.SatListItemModel
import com.tc.midterm_api_mvvm_firebase.data.model.school.SchoolListItemModel


interface Repository {
    suspend fun getSchools():List<SchoolListItemModel>
    //suspend -> pauses functionality until resources become available
    //helps run in the background
    //required to run in coroutines


    suspend fun getSatScore(dbn: String):List<SatListItemModel>
}