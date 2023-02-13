package com.example.vinnormanrecordapp.running

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vinnormanrecordapp.databinding.ActivityEditRunnungRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRunnungRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditRunnungRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val distance: String? = intent.getStringExtra("Distance")

        title = "$distance Record"
    }


}