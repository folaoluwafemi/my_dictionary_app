package com.example.dictionaryappdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryappdemo.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    companion object {
        private var isLinearLayoutManager: Boolean = true
        private const val LETTER = "letter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = binding.recyclerView

        val currentLetter = intent.extras?.get(LETTER).toString()


        title = currentLetter
    }
}