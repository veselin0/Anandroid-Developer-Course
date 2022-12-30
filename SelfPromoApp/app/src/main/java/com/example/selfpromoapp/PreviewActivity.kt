package com.example.selfpromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import com.example.selfpromoapp.databinding.ActivityMainBinding
import com.example.selfpromoapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val contactName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val myDisplayName = intent.getStringExtra("My Display Name")
        val includeJunior = intent.getBooleanExtra("Include Junior", false)
        val jobTitle = intent.getStringExtra("Job Title")
        val immediateStart = intent.getBooleanExtra("Immediate Start", false)
        val startDate = intent.getStringExtra("Start Date")
        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $myDisplayName, " +
                "Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"
        binding.textViewMessage.text = testString
    }
}