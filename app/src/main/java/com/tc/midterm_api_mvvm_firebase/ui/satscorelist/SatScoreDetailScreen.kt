package com.tc.midterm_api_mvvm_firebase.ui.satscorelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.tc.midterm_api_mvvm_firebase.data.model.satscore.SatListItemModel

@Composable
fun SatScoreDetailScreen(satScoreDbn : String){

    val viewModel = hiltViewModel<SatScoreListViewModel>()
    val satScore by viewModel.satScores.collectAsState()


}

@Composable
fun SatScoreDetailContent(satScore: SatListItemModel) {
    Column() {
        Card(
            elevation = CardDefaults.cardElevation(10.dp),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Column() {
                Row(
                    modifier = Modifier
                        .height(99.dp)
                        .background(color = Color(0xFFD1D1D1))
                        .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "${satScore.dbn}",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(0.5f)
                            .padding(start = 10.dp),
                        fontSize = 20.sp
                    )
                    Text(
                        text = "${satScore.schoolName}",
                        color = Color.Black,
                        modifier = Modifier
                            .weight(3f)
                            .padding(end = 5.dp),
                        textAlign = TextAlign.End
                    )
                }
            }
        }
        Column() {
            Text(
                text = "${satScore.numOfSatTestTakers}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "First brew: ${satScore.satCriticalReadingAvgScore}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "First brew: ${satScore.satMathAvgScore}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
            Text(
                text = "First brew: ${satScore.satWritingAvgScore}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}


