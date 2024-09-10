package com.example.findwork.interfaces

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.findwork.ui.vacancy.VacanciesList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Repository {

    var hhAPI: HH_API

    init {
        hhAPI = RetrofitInstance().getRetrofitInstance()
            .create(HH_API::class.java)
    }

    fun getVacanciesFromAPI(): LiveData<VacanciesList>{

        var data = MutableLiveData<VacanciesList>()
        var vacanciesList: VacanciesList
        GlobalScope.launch(Dispatchers.IO) {

            //  return response
            val response = hhAPI.getVacancies()
            if (response != null){
                vacanciesList = response.body()!!

                data.postValue(vacanciesList)
                Log.i("TAG1", "" + data.value)
            }
        }
        return data
    }

}