package com.example.moviewatchlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList:RecyclerView = findViewById(R.id.movielist)
        movieList.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Movie>() // blank list

        data.add(Movie("Avenger", 2014))
        data.add(Movie("Avenger: Age of Ultron", 2016))
        data.add(Movie("Abcd", 2016))
        data.add(Movie("Abcd 2", 2018))
        data.add(Movie("Fast & Furious", 2004))
        data.add(Movie("Avenger", 2014))
        data.add(Movie("Avenger: Age of Ultron", 2016))
        data.add(Movie("Abcd", 2016))
        data.add(Movie("Abcd 2", 2018))
        data.add(Movie("Fast & Furious", 2004))
        data.add(Movie("Avenger", 2014))
        data.add(Movie("Avenger: Age of Ultron", 2016))
        data.add(Movie("Abcd", 2016))
        data.add(Movie("Abcd 2", 2018))
        data.add(Movie("Fast & Furious", 2004))
        data.add(Movie("Avenger", 2014))
        data.add(Movie("Avenger: Age of Ultron", 2016))
        data.add(Movie("Abcd", 2016))
        data.add(Movie("Abcd 2", 2018))
        data.add(Movie("Fast & Furious", 2004))
        
        val adapter = MovieAdapter(data)
        movieList.adapter = adapter
    }


}