package com.example.findwork.ui.offer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.R

class OfferAdapter(val itemList: ArrayList<Offer>) :
    RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {

        val viewHolder2 = LayoutInflater.from(parent.context)
            .inflate(com.example.findwork.R.layout.offer_item,
                parent, false
            )

        return OfferViewHolder(viewHolder2)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {

        holder.titleOffer.set

    }

    class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var buttonOffer: String
        lateinit var idOffer: String
        lateinit var titleOffer: String
        lateinit var linkOffer: String

        init {
            titleOffer = itemView.findViewById<RecyclerView>()
        }

    }
}