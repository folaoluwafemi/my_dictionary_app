package com.example.dictionaryappdemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.dictionaryappdemo.R
import com.example.dictionaryappdemo.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var navCon: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Dictionary"

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navCon = navHostFragment.navController

        setupActionBarWithNavController(navCon)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navCon.navigateUp() || super.onSupportNavigateUp()
    }
}