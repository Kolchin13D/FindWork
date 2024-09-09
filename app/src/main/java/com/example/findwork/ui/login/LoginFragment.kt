package com.example.findwork.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.findwork.R
import com.example.findwork.databinding.FragmentDashboardBinding
import com.example.findwork.databinding.FragmentLoginBinding
import com.example.findwork.ui.favorite.FavoriteViewModel
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.inputEmail.setEndIconOnClickListener{
            Toast.makeText(
                requireContext(), "CLEAN TEXT", Toast.LENGTH_LONG
            ).show()
        }

        //return inflater.inflate(R.layout.fragment_login, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}