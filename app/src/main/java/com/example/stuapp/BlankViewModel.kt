package com.example.stuapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel() {
    private var data  = MutableLiveData<String>()
}