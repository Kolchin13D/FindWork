package com.example.findwork.ui.login

import android.app.FragmentTransaction
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.findwork.R
import com.example.findwork.databinding.FragmentLoginBinding
import com.example.findwork.ui.password.PasswordFragment
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.intellij.lang.annotations.Pattern

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.inputEmail.setEndIconOnClickListener {
            binding.InputEditTextEmail.setText("")
        }

        binding.InputEditTextEmail.doOnTextChanged { text, start, before, count ->
            if (Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
                binding.inputEmail.helperText = null

                binding.inputEmail.isStartIconVisible = false
                binding.nextBtn.setTextColor(Color.WHITE)
                binding.nextBtn.setBackgroundColor(resources.getInteger(R.color.blue.toInt()))

                binding.nextBtn.setOnClickListener {
                    val navController = findNavController()
                    navController.navigate(R.id.navigation_password)
                }

            } else {
                binding.inputEmail.helperText = "Вы ввели неверный e-mail"
            }
        }



        //return inflater.inflate(R.layout.fragment_login, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


