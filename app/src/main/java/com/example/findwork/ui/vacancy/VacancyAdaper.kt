package com.example.findwork.ui.vacancy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.R

class VacancyAdaper(val itemList: ArrayList<Vacancy>) :
    RecyclerView.Adapter<VacancyAdaper.VacancyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VacancyViewHolder {

        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.vacancy_item,
            parent, false
        )

        return VacancyViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: VacancyViewHolder, position: Int) {

        holder.lookingNumber.setText(itemList[position].lookingNumber)
        holder.title.setText(itemList[position].titleVacancy)
        holder.address.setText(itemList[position].address)
        holder.company.setText(itemList[position].company)
        holder.experience.setText(itemList[position].experience)
        holder.publishedDate.setText(itemList[position].publishedDate)

    }

    class VacancyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var lookingNumber: TextView
        lateinit var title: TextView
        lateinit var address: TextView
        lateinit var company: TextView
        lateinit var experience: TextView
        lateinit var publishedDate: TextView

        init {
            lookingNumber = itemView.findViewById(R.id.lookingNumber)
            title = itemView.findViewById(R.id.titleVacancy)
            address = itemView.findViewById(R.id.address)
            company = itemView.findViewById(R.id.company)
            experience = itemView.findViewById(R.id.experience)
            publishedDate = itemView.findViewById(R.id.publishedDate)

            itemView.setOnClickListener() {
                Toast.makeText(
                    itemView.context,
                    "You select ${itemView}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    }

}