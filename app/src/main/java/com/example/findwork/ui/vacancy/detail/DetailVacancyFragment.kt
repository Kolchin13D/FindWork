package com.example.findwork.ui.vacancy.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.databinding.FragmentDetailVacancyBinding
import com.example.findwork.ui.response.ResponseDialogFragment

class DetailVacancyFragment : Fragment() {

    private var _binding: FragmentDetailVacancyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailVacancyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerViewQuestions: RecyclerView = binding.recyclerViewQuestions
        recyclerViewQuestions.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )

        var itemList: ArrayList<QuestionModel> = java.util.ArrayList()
        val obj1 = QuestionModel("Где распологается место работы?")
        val obj2 = QuestionModel("Какой график работы??")
        val obj3 = QuestionModel("Вакансия открыта?")
        val obj4 = QuestionModel("Какая оплата труда?")

        itemList.add(obj1)
        itemList.add(obj2)
        itemList.add(obj3)
        itemList.add(obj4)

        val questionAdapter = QuestionAdaper(itemList)
        recyclerViewQuestions.adapter = questionAdapter

        binding.detVacResBtn.setOnClickListener {


            val showDialog = ResponseDialogFragment()
            showDialog.show((activity as AppCompatActivity).supportFragmentManager, "showDialog")

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}