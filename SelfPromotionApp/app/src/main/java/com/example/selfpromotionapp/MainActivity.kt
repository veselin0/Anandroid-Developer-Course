package com.example.selfpromotionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.selfpromotionapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonPreview.setOnClickListener {
            onPreviewClicked()
        }

    }

    private fun onPreviewClicked() {

        val contactName = binding.editTextContactName.text.toString()
        val contactNumber = binding.editTextContactNumber.text.toString()
        val myDisplayName = binding.editTextMyDisplayName.text.toString()
        val includeJunior = binding.checkBoxJunior.isChecked
        val jobTitle = binding.spinnerJobTitle.selectedItem?.toString()
        val immediateStart = binding.checkBoxImmediateStart.isChecked
        val startDate = binding.editTextStartDate.text.toString()

//        val testString = """
//            Contact Name: $contactName
//            Contact Number: $contactNumber
//            My Display Nme: $myDisplayName
//            Include Junior: $includeJunior
//            Job Title: $jobTitle
//            Immediate Start: $immediateStart
//            Start Date: $startDate
//        """.trimIndent()
//
//        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()

        val intent = Intent(this, PreviewActivity::class.java)
        intent.putExtra("Contact Name", contactName)
        intent.putExtra("Contact Number", contactNumber)
        intent.putExtra("My Display Name", myDisplayName)
        intent.putExtra("Include Junior", includeJunior)
        intent.putExtra("Job Title", jobTitle)
        intent.putExtra("Immediate Start", immediateStart)
        intent.putExtra("Start Date", startDate)
        startActivity(intent)
    }
}