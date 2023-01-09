package com.example.testbottomnavigationapp.ui.cycling

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CyclingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is cycling Fragment"
    }
    val text: LiveData<String> = _text
}