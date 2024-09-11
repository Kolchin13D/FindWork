package com.example.findwork.ui.vacancy.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.R

class QuestionAdaper(val itemList: ArrayList<QuestionModel>) :
    RecyclerView.Adapter<QuestionAdaper.QuestionViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QuestionAdaper.QuestionViewHolder {

        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.question_item,
                parent,
                false
            )

        return QuestionViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: QuestionAdaper.QuestionViewHolder, position: Int) {

        holder.question_text.setText(itemList[position].question_text)

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class QuestionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var question_text: TextView

        init {
            question_text = itemView.findViewById(R.id.questionTV)
        }
    }

}