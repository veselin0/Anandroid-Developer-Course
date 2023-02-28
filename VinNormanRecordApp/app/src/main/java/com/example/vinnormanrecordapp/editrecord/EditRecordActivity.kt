package com.example.vinnormanrecordapp.editrecord

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.edit
import com.example.vinnormanrecordapp.databinding.ActivityEditRecordBinding

class EditRecordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditRecordBinding

    private val screenData: ScreenData by lazy {
        
    }

    private val recordPreferences by lazy {
        getSharedPreferences(
            "running",
            Context.MODE_PRIVATE
        )
    }
    private val record by lazy { intent.getStringExtra("Distance") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEditRecordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()

        displayRecord()
    }

    private fun setupUI() {
        title = "$record Record"
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
        binding.editTextRecord.setText(recordPreferences.getString("$record record", null))
        binding.editTextDate.setText(recordPreferences.getString("$record date", null))
    }

    private fun saveRecord() {
        val record = binding.editTextRecord.text.toString()
        val date = binding.editTextDate.text.toString()

        val runningPreferences = getSharedPreferences("running", Context.MODE_PRIVATE)

        runningPreferences.edit {
            putString("${this@EditRecordActivity.record} record", record)
            putString("${this@EditRecordActivity.record} date", date)
        }
    }

    private fun clearRecord() {
        recordPreferences.edit {
            remove("$record record")
            remove("$record date")
        }
    }

    data class ScreenData(
        val record: String,
        val sharedPreferencesName: String,
        val recordFieldHint: String
    )

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