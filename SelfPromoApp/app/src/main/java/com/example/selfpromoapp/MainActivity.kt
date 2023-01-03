package com.example.selfpromoapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.selfpromoapp.databinding.ActivityMainBinding

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

        val spinnerValues = arrayOf("Android Developer", "Android Engineer")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,
            spinnerValues)
        binding.spinnerJobTitle.adapter = spinnerAdapter

    }

    private fun onPreviewClicked() {

        val message = Message(
            binding.editTextContactName.text.toString(),
            binding.editTextContactNumber.text.toString(),
            binding.editTextMyDisplayName.text.toString(),
            binding.checkBoxJunior.isChecked,
            binding.spinnerJobTitle.selectedItem?.toString(),
            binding.checkBoxImmediateStart.isChecked,
            binding.editTextStartDate.text.toString()
        )

        val intent = Intent(this, PreviewActivity::class.java)

        intent.putExtra("Message", message)

        startActivity(intent)
    }
}