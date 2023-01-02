package com.example.selfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.example.selfpromoapp.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_preview.setOnClickListener {
            onPreviewClicked()
        }

    }

    private fun onPreviewClicked() {
        val contactName = edit_text_contact_name.toString()
        val contactNumber = edit_text_contact_number.toString()
        val myDisplayName = edit_text_my_display_name.toString()
        val includeJunior = check_box_junior.isChecked
        val jobTitle = spinner_job_title.selectedItem?.toString()
        val immediateStart = check_box_immediate_start.isChecked
        val startDate = edit_text_start_date.toString()

        val testString = """
            Contact Name: $contactName,
            Contact Number: $contactNumber,
            My Display Name: $myDisplayName,
            Include Junior: $includeJunior,
            Job Title: $jobTitle,
            ImmediateStart: $immediateStart,
            Start Date: $startDate
                  """.trimIndent()

        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()

    }
}