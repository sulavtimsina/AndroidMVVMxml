package com.sulav.androidmvvmxml

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class DataFragment : Fragment() {
    private lateinit var viewModel: DataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(DataViewModel::class.java)

        viewModel.data.observe(viewLifecycleOwner, Observer { data ->
            // Update UI with the data
        })

        return inflater.inflate(R.layout.fragment_data, container, false)
    }
}
