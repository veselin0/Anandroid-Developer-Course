package com.example.myform

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.myform.databinding.ActivityMainBinding
import com.example.myform.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonToSummary.setOnClickListener{
            onToSummaryClicked()
        }

        val spinnerValues = arrayOf("Miss", "Mrs.", "Mr.")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,
        spinnerValues)

        binding.spinnerTitle.adapter = spinnerAdapter
    }

    private fun onToSummaryClicked() {

        val summary = Summary(
            binding.spinnerTitle.selectedItem?.toString(),
            binding.editTextFirstName.text.toString(),
            binding.editTextLastName.text.toString()
        )

        val intent = Intent(this, UserDetails::class.java)

        intent.putExtra("Summary", summary)
        val phone = binding.editTextPhone.text.toString()
        intent.putExtra("Phone", phone)
        val email = binding.editTextEmail.text.toString()
        intent.putExtra("Email", email)

        startActivity(intent)
    }
}


