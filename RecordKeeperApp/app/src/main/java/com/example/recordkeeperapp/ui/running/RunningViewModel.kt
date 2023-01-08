package com.example.recordkeeperapp.ui.running

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RunningViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hooray! Now I can add Fragments to my App!"
    }
    val text: LiveData<String> = _text
}