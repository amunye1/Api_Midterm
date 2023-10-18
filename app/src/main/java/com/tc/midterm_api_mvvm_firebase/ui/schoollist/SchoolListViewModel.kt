package com.tc.midterm_api_mvvm_firebase.ui.schoollist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tc.midterm_api_mvvm_firebase.data.model.school.SchoolListItemModel
import com.tc.midterm_api_mvvm_firebase.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SchoolListViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel(){
    //read and wirte mutable
    private val _schools = MutableStateFlow<List<SchoolListItemModel>>(emptyList())
    //read only state
    val schools : StateFlow<List<SchoolListItemModel>> = _schools

    init {
        getSchools()
    }

    private fun getSchools() {
        viewModelScope.launch {
            val response = repository.getSchools()

            _schools.emit(response ?: emptyList() )
        }
    }
}