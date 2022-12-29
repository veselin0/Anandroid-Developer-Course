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

        binding.textViewMessage.text = "This will be message preview: Arduino has been chosen" +
                " as the embedded system for this book, and specifically Arduino " +
                " boards that have 8-bit AVR microcontrollers on-board and can be fitted with the standard" +
                " add-on boards called shields."
    }
}