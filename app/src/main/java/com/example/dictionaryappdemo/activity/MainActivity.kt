package com.example.dictionaryappdemo.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dictionaryappdemo.R
import com.example.dictionaryappdemo.activity.DetailActivity.Companion
import com.example.dictionaryappdemo.adapter.LetterAdapter
import com.example.dictionaryappdemo.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    companion object{
        private var isLinearLayoutManager: Boolean = true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Dictionary"

    }
}