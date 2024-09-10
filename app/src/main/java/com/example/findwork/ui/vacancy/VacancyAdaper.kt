package com.example.findwork.ui.vacancy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.drawerlayout.R
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.ui.search.SearchFragment

class VacancyAdaper(val itemList: ArrayList<Vacancy>) :
    RecyclerView.Adapter<VacancyAdaper.VacancyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VacancyViewHolder {

        val viewHolder2 = LayoutInflater.from(parent.context)
            .inflate(com.example.findwork.R.layout.vacancy_item,
            parent, false
        )

        return VacancyViewHolder(viewHolder2)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: VacancyViewHolder, position: Int) {

//        holder.lookingNumber.setText(itemList[position].lookingNumber)
//        holder.title.setText(itemList[position].title)
//        holder.address.setText(itemList[position].address)
//        holder.company.setText(itemList[position].company)
//        holder.experience.setText(itemList[position].experience)
//        holder.publishedDate.setText(itemList[position].publishedDate)

    }

    class VacancyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var lookingNumber: TextView

        lateinit var title: TextView
        lateinit var address: TextView
        lateinit var company: TextView
        lateinit var experience: TextView
        lateinit var publishedDate: TextView

        init {

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