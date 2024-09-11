package com.example.findwork.ui.response

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.findwork.R
import com.example.findwork.databinding.FragmentResponseDialogBinding


class ResponseDialogFragment : DialogFragment() {


    private var _binding: FragmentResponseDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView: View = inflater.inflate(R.layout.fragment_response_dialog, container, false)

        _binding = FragmentResponseDialogBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return rootView

//        return inflater.inflate(R.layout.fragment_response_dialog, container, false)
    }


}