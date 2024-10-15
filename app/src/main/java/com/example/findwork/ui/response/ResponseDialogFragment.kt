package com.example.findwork.ui.response

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.InsetDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.findwork.R
import com.example.findwork.databinding.FragmentResponseDialogBinding


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

        val back = ColorDrawable(Color.TRANSPARENT)
        val inset = InsetDrawable(back, 0)
        customDialog!!.window!!.setBackgroundDrawable(inset)

        customDialog.window?.setGravity(Gravity.BOTTOM)
        customDialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )



        return customDialog
    }


    override fun getTheme(): Int = R.style.NoMarginsDialog

}