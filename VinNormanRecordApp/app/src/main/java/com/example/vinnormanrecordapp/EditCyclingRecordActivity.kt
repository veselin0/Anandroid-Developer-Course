package com.example.vinnormanrecordapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vinnormanrecordapp.databinding.ActivityEditCyclingRecordBinding

class EditCyclingRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditCyclingRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditCyclingRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val challenge: String? = intent.getStringExtra("Challenge")

        title = "$challenge Record"
    }
}