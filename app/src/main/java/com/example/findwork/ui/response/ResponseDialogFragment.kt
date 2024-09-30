package com.example.findwork.ui.response

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.findwork.R
import com.example.findwork.databinding.FragmentResponseDialogBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class ResponseDialogFragment : DialogFragment() {

    private var _binding: FragmentResponseDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateDialog(
        savedInstanceState: Bundle?
    ): Dialog {
        val builder = AlertDialog.Builder(context)
        builder.setView(R.layout.fragment_response_dialog)

        val customDialog = builder.create()
        customDialog.show()

        customDialog.window?.setGravity(Gravity.BOTTOM)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        //customDialog.requestWindowFeature(Window.FEATURE_CUSTOM_TITLE)

        val displayMetrics = DisplayMetrics()

        context?.let { MaterialAlertDialogBuilder(it, R.style.NoMarginsDialog) }



        return customDialog
    }

    override fun getTheme(): Int = R.style.NoMarginsDialog

}