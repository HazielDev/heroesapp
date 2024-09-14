package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.modules.Dc
import com.squareup.picasso.Picasso

class DcAdapter(val dcs : List<Dc>) : RecyclerView.Adapter<DcViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DcViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent,false)
        return  DcViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dcs.count()
    }

    override fun onBindViewHolder(holder: DcViewHolder, position: Int) {
        val dc = dcs[position]
        holder.dcTextView.text = dc.name
        Picasso.get().load(dc.image).into(holder.dcImage)
    }
}

class DcViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val dcImage: ImageView = view.findViewById(R.id.marvel_image)
    val dcTextView: TextView = view.findViewById(R.id.marvel_name)
}