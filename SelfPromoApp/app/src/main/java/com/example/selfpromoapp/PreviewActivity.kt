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

        val message = intent.getSerializableExtra("Message") as Message
    }
}