package com.tc.midterm_api_mvvm_firebase.ui.satscorelist

import androidx.lifecycle.ViewModel
import com.tc.midterm_api_mvvm_firebase.data.model.satscore.SatListItemModel
import com.tc.midterm_api_mvvm_firebase.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SatScoreListViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel(){
    private val _satScores = MutableStateFlow<SatListItemModel>(SatListItemModel())
    val satScores : StateFlow<SatListItemModel> = _satScores

    suspend fun getSatScores(dbn :String ){
        if(satScores.value.dbn == dbn){
            val response = repository.getSatScore(dbn)
            _satScores.emit(response[0] ?: SatListItemModel())
        }

    }
}