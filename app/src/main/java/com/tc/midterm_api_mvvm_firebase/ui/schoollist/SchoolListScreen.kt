package com.tc.midterm_api_mvvm_firebase.ui.schoollist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

import com.tc.midterm_api_mvvm_firebase.data.model.school.SchoolListItemModel
import com.tc.midterm_api_mvvm_firebase.ui.navigation.Screens

@Composable
fun SchoolScreen(
    navController: NavController
){
    val viewModel = hiltViewModel<SchoolListViewModel>()
    val schools by viewModel.schools.collectAsState()

    val navigateToDetail: (String)-> Unit = {dbn->
        navController.navigate("${Screens.SchoolList.route}/$dbn")
    }

    LazyColumn{
        items(schools){schools ->
            SchoolItem(schools, navigateToDetail)


        }
    }
}

@Composable
fun SchoolItem(schools: SchoolListItemModel, navigateToDetail: (String) -> Unit) {

    Card(
        elevation = CardDefaults.cardElevation(10.dp),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxHeight()
            .clickable { navigateToDetail(schools.dbn.toString()) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .height(99.dp)
                .background(color = Color(0xFFD1D1D1))
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "${schools.schoolName}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,

                modifier = Modifier
                    .weight(3f)
                    .padding(start = 10.dp),
                fontSize = 20.sp,
                maxLines = 5

            )
            Text(
                text = "${schools.borough}",
                color = Color.Black,
                modifier = Modifier
                    .weight(3f)
                    .padding(end = 5.dp),
                textAlign = TextAlign.End
            )
        }
    }

}