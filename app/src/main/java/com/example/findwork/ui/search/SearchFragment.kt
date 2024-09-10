package com.example.findwork.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

        val obj1 = Vacancy("Moscow", "OOO 1c", "3", 14, "11.01.24", "Employer")
        itemList.add(obj1)

        val obj2 = Offer("1","2")
        offerList.add(obj2)

        val vacancyAdapter = VacancyAdaper(itemList)
        recyclerViewVacancies.adapter = vacancyAdapter

        val offerAdapter = OfferAdapter(offerList)
        recyclerViewOffer.adapter = offerAdapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}