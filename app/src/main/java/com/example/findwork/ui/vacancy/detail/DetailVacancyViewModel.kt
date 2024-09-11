package com.example.findwork.ui.vacancy.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DetailVacancyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //value = "DETAIL"
    }
    val text: LiveData<String> = _text
}