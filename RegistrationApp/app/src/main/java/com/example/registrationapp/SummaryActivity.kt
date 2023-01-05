package com.example.registrationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SummaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        retrieveUser()
        displayUser()
        setupClickListeners()
    }

    private fun setupClickListeners() {
        TODO("Not yet implemented")
    }

    private fun displayUser() {
        TODO("Not yet implemented")
    }

    private fun retrieveUser() {
        TODO("Not yet implemented")
    }
}