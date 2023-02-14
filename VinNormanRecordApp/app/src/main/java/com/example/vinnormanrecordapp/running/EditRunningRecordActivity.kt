package com.example.vinnormanrecordapp.running

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.example.vinnormanrecordapp.databinding.ActivityEditRunnungRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRunnungRecordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditRunnungRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val distance = intent.getStringExtra("Distance")

        title = "$distance Record"

        val applicationPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        applicationPreferences.edit {
            putString("Some application data", "Application preference value here")
        }

        val activityPreferences = getPreferences(Context.MODE_PRIVATE)

        activityPreferences.edit {
            putInt("Some activity data", 15)
        }

        val fileNamePreferences = getSharedPreferences(
            "some shared preference file", Context.MODE_PRIVATE
        )

        fileNamePreferences.edit {
            putBoolean("some preference file name", false)
        }

    }


}