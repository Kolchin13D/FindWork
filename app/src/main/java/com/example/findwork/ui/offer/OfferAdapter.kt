package com.example.findwork.ui.offer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.R

class OfferAdapter(val itemList: ArrayList<Offer>) :
    RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {

        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(com.example.findwork.R.layout.offer_item,
                parent, false)

        return OfferViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: OfferAdapter.OfferViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
        return itemList.size
    }


    class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var button: Button
        lateinit var id: String
        lateinit var link: String
        lateinit var title: String

        init {


        }
    }
}