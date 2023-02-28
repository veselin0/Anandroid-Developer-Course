package com.example.vinnormanrecordapp.running

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import com.example.vinnormanrecordapp.databinding.ActivityEditRunnungRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRunnungRecordBinding
    private lateinit var runningPreferences: SharedPreferences
    private val distance: String? by lazy { intent.getStringExtra("Distance") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditRunnungRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        runningPreferences = getSharedPreferences("running", Context.MODE_PRIVATE)


        title = "$distance Record"


// EXAMPLES OF SHARED PREFERENCES
//        val applicationPreferences = PreferenceManager.getDefaultSharedPreferences(this)
//        applicationPreferences.edit {
//            putString("Some application data", "Application preference value here")
//        }
//        val activityPreferences = getPreferences(Context.MODE_PRIVATE)
//        activityPreferences.edit {
//            putInt("Some activity data", 15)
//        }
//        val fileNamePreferences = getSharedPreferences(
//            "some shared preference file", Context.MODE_PRIVATE
//        )
//        fileNamePreferences.edit {
//            putBoolean("some preference file name", false)
//        }

        displayRecord()
        binding.buttonSave.setOnClickListener {
            saveRecord()
            finish()
        }
    }


    private fun displayRecord() {
        val runningPreferences = getSharedPreferences("running", Context.MODE_PRIVATE)
        binding.editTextRecord.setText(runningPreferences.getString("$distance record", null))
        binding.editTextDate.setText(runningPreferences.getString("$distance date", null))
    }

    private fun saveRecord() {
        val record = binding.editTextRecord.text.toString()
        val date = binding.editTextDate.text.toString()

        val runningPreferences = getSharedPreferences("running", Context.MODE_PRIVATE)

//        Old way to save data:
//        val editor = runningPreferences.edit()
//        editor.putString("record", record)
//        editor.putString("date", date)
//        editor.apply()

        runningPreferences.edit {
            putString("$distance record", record)
            putString("$distance date", date)
        }

    }


}