package com.example.perfectmovie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.perfectmovie.Model.ViewModel

class ItemAdapter(
    private val context: Context,
    private val movie: List<ViewModel>,
    val listener: (ViewModel) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ImageViewHolder>() {

    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rating = view.findViewById<TextView>(R.id.vote_average)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(
            LayoutInflater.from(context).inflate(R.layout.movie_item_list, parent, false)
        )

    override fun getItemCount(): Int = movie.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
    }

}