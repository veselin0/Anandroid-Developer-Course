package com.example.selfpromoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val previewButton: Button = findViewById(R.id.button_preview)
        previewButton.setOnClickListener {
            onPreviewClicked()

        }
    }

    private fun onPreviewClicked() {
        val contactNameEditText: TextInputEditText = findViewById(R.id.edit_text_contact_name)
        val contactNumberEditText: TextInputEditText = findViewById(R.id.edit_text_contact_number)
        val testString = contactNameEditText.text.toString() + ", " + contactNumberEditText.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_SHORT).show()
    }
}