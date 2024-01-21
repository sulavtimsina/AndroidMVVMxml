package com.sulav.androidmvvmxml

class DataRepository(private val apiService: ApiService) {
    suspend fun fetchData() = apiService.fetchData()
}
