package com.tc.midterm_api_mvvm_firebase.data.model.satscore


import com.google.gson.annotations.SerializedName

data class SatListItemModel(
    @SerializedName("dbn")
    val dbn: String? = "",
    @SerializedName("num_of_sat_test_takers")
    val numOfSatTestTakers: String? = "",
    @SerializedName("sat_critical_reading_avg_score")
    val satCriticalReadingAvgScore: String? = "",
    @SerializedName("sat_math_avg_score")
    val satMathAvgScore: String? = "",
    @SerializedName("sat_writing_avg_score")
    val satWritingAvgScore: String? = "",
    @SerializedName("school_name")
    val schoolName: String? = ""
)