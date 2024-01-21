package com.sulav.androidmvvmxml

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor())
            .build()

        val apiService = Retrofit.Builder()
            .baseUrl("https://api.jsonbin.io/v3/b/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        val repository = DataRepository(apiService)

        val factory = DataViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(DataViewModel::class.java)
        viewModel.data.observe(this, Observer { data ->
            findViewById<TextView>(R.id.textView).text = data?.body
        })

    }
}