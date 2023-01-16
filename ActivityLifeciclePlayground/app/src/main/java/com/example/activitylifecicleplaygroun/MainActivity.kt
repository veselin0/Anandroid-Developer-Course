package com.example.activitylifecicleplaygroun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.activitylifecicleplaygroun.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var isFirstLoad = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonExit.setOnClickListener {
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        if (isFirstLoad) {
            binding.textViewRefreshStatus.text = "Welcome to ther app! Her is your feed..."
            isFirstLoad = false
        } else {
            binding.textViewRefreshStatus.text = "Your fees has been updated ..."
        }

    }
}