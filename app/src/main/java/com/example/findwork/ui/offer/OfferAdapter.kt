package com.example.findwork.ui.offer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.findwork.R

class OfferAdapter(val itemList: ArrayList<Offer>) :
    RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {

        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(com.example.findwork.R.layout.offer_item,
                parent, false
            )

        return OfferViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {

        holder.titleOffer.setText(itemList[position].titleOffer)
        holder.linkOffer.setText(itemList[position].linkOffer)

    }


    inner class OfferViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        lateinit var buttonOffer: TextView
        lateinit var idOffer: TextView
        lateinit var titleOffer: TextView
        lateinit var linkOffer: TextView

        init{
            titleOffer = itemView.findViewById(R.id.titleOffer)
            linkOffer = itemView.findViewById(R.id.linkOffer)
        }

    }
}