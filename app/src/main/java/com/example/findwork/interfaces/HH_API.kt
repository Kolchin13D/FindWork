package com.example.findwork.interfaces

import com.example.findwork.ui.vacancy.VacanciesList
import retrofit2.Response
import retrofit2.http.GET

interface HH_API {

    @GET("")
    suspend fun getVacancies(): Response<VacanciesList>

}