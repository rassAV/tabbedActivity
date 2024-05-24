package com.example.tabbedactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MovieFragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_film1, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.titleTextView1).text = getString(R.string.movie_title_1)
        view.findViewById<TextView>(R.id.authorTextView1).text = getString(R.string.movie_author_1)
        view.findViewById<TextView>(R.id.descriptionTextView1).text = getString(R.string.movie_description_1)
    }
}