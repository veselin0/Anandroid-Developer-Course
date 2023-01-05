package com.example.registrationapp

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.registrationapp.databinding.ActivityMainBinding
import com.example.registrationapp.databinding.ActivityMainBinding.bind
import com.example.registrationapp.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupSpinner()
        setupButton()
    }

    private fun setupButton() {
        val titles = arrayOf("Miss", "Mrs", "Ms", "Mr", "Mx", "Dr", "Prof")
        val titleAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,
        titles)
        binding.spinnerTitle.adapter = titleAdapter
    }

    private fun setupSpinner() {
        binding.buttonCreateAccount.setOnClickListener {
            createAccount()
        }
    }

    private fun createAccount(){
        val user = User(
            binding.spinnerTitle.selectedItem as String,
            binding.editTextFirstName.toString(),
            binding.editTextLastName.toString(),
            binding.editTextEmail.toString(),
            binding.editTextPhone.toString(),
            binding.editTextPassword.toString()
        )
    }
}