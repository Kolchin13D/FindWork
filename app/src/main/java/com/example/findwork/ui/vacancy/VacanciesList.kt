package com.example.findwork.ui.vacancy

import com.example.findwork.ui.offer.Offer

data class VacanciesList(
    val offers: List<Offer>,
    val vacancies: List<Vacancy>
)