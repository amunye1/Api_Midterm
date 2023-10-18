package com.tc.midterm_api_mvvm_firebase.ui.navigation

import com.tc.midterm_api_mvvm_firebase.ui.navigation.ScreenName.SATSCORES

enum class Screens (val route: String, val header:String){
    SatScores(route = ScreenName.SATSCORES,header="Sat score list"),
    SchoolList(route =ScreenName.SCHOOL, header="School list")
}

object ScreenName{
    const val SATSCORES: String ="sat_score_detail_screen"
    const val SCHOOL : String = "school_list_screen"

}