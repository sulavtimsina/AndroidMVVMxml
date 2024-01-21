package com.sulav.androidmvvmxml

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("65ac5292266cfc3fde7d120a")
    suspend fun fetchData(): Response<JsonBinResponse>
}
