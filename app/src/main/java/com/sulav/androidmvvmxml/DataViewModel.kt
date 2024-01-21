package com.sulav.androidmvvmxml

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class DataViewModel(private val repository: DataRepository) : ViewModel() {
    private val _data = MutableLiveData<RecordX>()
    val data: LiveData<RecordX> = _data

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            try {
                val a = repository.fetchData().body()?.record
                a?.let {
                    _data.value = it
                }
            } catch (e: Exception) {
                // Handle exceptions
            }
        }
    }
}
