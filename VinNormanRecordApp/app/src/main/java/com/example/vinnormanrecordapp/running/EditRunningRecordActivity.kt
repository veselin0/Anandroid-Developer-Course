package com.example.vinnormanrecordapp.running

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import com.example.vinnormanrecordapp.databinding.ActivityEditRunnungRecordBinding

class EditRunningRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRunnungRecordBinding
    private val runningPreferences by lazy {
        getSharedPreferences(
            "running",
            Context.MODE_PRIVATE
        )
    }
    private val distance by lazy { intent.getStringExtra("Distance") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditRunnungRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()

        displayRecord()
    }

    private fun setupUI() {
        title = "$distance Record"
        binding.buttonSave.setOnClickListener {
            saveRecord()
            finish()
        }
        binding.buttonDelete.setOnClickListener {
            clearRecord()
            finish()
        }
    }


    private fun displayRecord() {
        binding.editTextRecord.setText(runningPreferences.getString("$distance record", null))
        binding.editTextDate.setText(runningPreferences.getString("$distance date", null))
    }

    private fun saveRecord() {
        val record = binding.editTextRecord.text.toString()
        val date = binding.editTextDate.text.toString()

        val runningPreferences = getSharedPreferences("running", Context.MODE_PRIVATE)

        runningPreferences.edit {
            putString("$distance record", record)
            putString("$distance date", date)
        }
    }

    private fun clearRecord() {
        runningPreferences.edit {
            remove("$distance record")
            remove("$distance date")
        }
    }


}
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

//        Old way to save data:
//        val editor = runningPreferences.edit()
//        editor.putString("record", record)
//        editor.putString("date", date)
//        editor.apply()