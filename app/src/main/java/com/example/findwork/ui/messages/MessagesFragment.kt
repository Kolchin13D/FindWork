package com.example.findwork.ui.messages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.findwork.R
import com.example.findwork.databinding.FragmentDashboardBinding
import com.example.findwork.ui.favorite.FavoriteViewModel


class MessagesFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val dashboardViewModel =
            ViewModelProvider(this).get(MessagesViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDashboard
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}