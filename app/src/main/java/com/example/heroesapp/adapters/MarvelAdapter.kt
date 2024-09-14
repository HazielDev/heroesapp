package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.modules.Marvel
import com.squareup.picasso.Picasso

class MarvelAdapter(val marvels : List<Marvel>) : RecyclerView.Adapter<MarvelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.character_item, parent,false)
        return  MarvelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return marvels.count()
    }

    override fun onBindViewHolder(holder: MarvelViewHolder, position: Int) {
        val marvel = marvels[position]
        holder.marvelTextView.text = marvel.name
        Picasso.get().load(marvel.image).into(holder.marvelImage)
    }
}

class MarvelViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val marvelImage: ImageView = view.findViewById(R.id.marvel_image)
    val marvelTextView: TextView = view.findViewById(R.id.marvel_name)
}