package com.example.moviewatchlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val movList: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieHolder>() {

    class MovieHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textMovie: TextView = view.findViewById(R.id.textMovie)
        val textYear: TextView = view.findViewById(R.id.textYear)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.single_card_item_row, parent, false
        )
        return MovieHolder(view)
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        val item: Movie = movList[position]
        holder.textMovie.text = item.title
        holder.textYear.text = item.year.toString()
    }

    override fun getItemCount(): Int {
        return movList.size
    }
}