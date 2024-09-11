package com.example.findwork.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.databinding.FragmentHomeBinding
import com.example.findwork.ui.offer.Offer
import com.example.findwork.ui.offer.OfferAdapter
import com.example.findwork.ui.vacancy.Vacancy
import com.example.findwork.ui.vacancy.VacancyAdaper

class SearchFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val homeViewModel =
            ViewModelProvider(this).get(SearchViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerViewVacancies: RecyclerView = binding.recyclerVacancies
        recyclerViewVacancies.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        val recyclerViewOffer: RecyclerView = binding.recyclerOffers
        recyclerViewOffer.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )



        var itemList: ArrayList<Vacancy> = java.util.ArrayList()
        var offerList: ArrayList<Offer> = java.util.ArrayList()

        val obj1 = Vacancy("Moscow", "OOO 1c", "1 -3 years", "13", "11.01.24", "1C Developer")
        itemList.add(obj1)

        val obj2 = Vacancy("SPB", "HH.RU", "0 - 1 years", "10", "13.06.24", "Recruiter")
        itemList.add(obj2)

        val off1 = Offer("Вакансии\nрядом с вами","")
        val off2 = Offer("Поднять резюме\nв поиске","Поднять")
        val off3 = Offer("Временная\nработа и\nподработка","")
        offerList.add(off1)
        offerList.add(off2)
        offerList.add(off3)


        val vacancyAdapter = VacancyAdaper(itemList)
        recyclerViewVacancies.adapter = vacancyAdapter

        val offerAdapter = OfferAdapter(offerList)
        recyclerViewOffer.adapter = offerAdapter

        binding.moreVacanciesBtn.setOnClickListener{
            Toast.makeText(
                context,
                "You select more vacancies",
                Toast.LENGTH_SHORT
            ).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}