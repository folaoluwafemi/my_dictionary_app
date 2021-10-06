package com.example.dictionaryappdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
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