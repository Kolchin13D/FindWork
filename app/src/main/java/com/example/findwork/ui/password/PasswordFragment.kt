package com.example.findwork.ui.password

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.findwork.R
import com.example.findwork.databinding.FragmentPasswordBinding


class PasswordFragment : Fragment() {

    private var _binding: FragmentPasswordBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPasswordBinding.inflate(inflater, container, false)

        binding.button.setOnClickListener{
            val navController = findNavController()
            navController.navigate(R.id.navigation_search)
        }



        //return inflater.inflate(R.layout.fragment_password, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}