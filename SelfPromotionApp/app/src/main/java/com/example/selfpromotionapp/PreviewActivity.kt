package com.example.selfpromotionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.selfpromotionapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        val textString = "Learning a new programming language and learning how to program embedded systems\n" +
//                "covers a lot of ground as there are many things to learn: the C programming language\n" +
//                "itself, some knowledge of microcontroller architecture"
//        binding.textViewMessage.text = textString

        val contactName = intent.getStringExtra("Contact Name")
        val contactNumber = intent.getStringExtra("Contact Number")
        val myDisplayName = intent.getStringExtra("My Display Name")
        val includeJunior = intent.getBooleanExtra( "Include Junior", false)
        val jobTitle = intent.getStringExtra("Job Title")
        val immediateStart = intent.getBooleanExtra("Immediate Start", false)
        val startDate = intent.getStringExtra("Start Date")

        val testString = """
            Contact Name: $contactName
            Contact Number: $contactNumber
            My Display Name: $myDisplayName
            Include Junior: $includeJunior
            Job Title: $jobTitle
            Immediate Start: $immediateStart
            Start Date: $startDate
        """.trimIndent()

        binding.textViewMessage.text = testString
    }
}