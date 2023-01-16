package com.example.activitylifecicleplaygroun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_exit).setOnClickListener {
            Log.d("Gocho Kopchev", "In the button click listener...")
            finish()
        }
        Log.d("GochoKochev", "I am in onCreate()!!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("GochoKochev", "I am in onStart()!!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("GochoKochev", "I am in onResume()!!")

    }

    override fun onPause() {
        super.onPause()
        Log.d("GochoKochev", "I am in onPause()!!")

    }

    override fun onStop() {
        super.onStop()
        Log.d("GochoKochev", "I am in onStop()!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Gocho Kochev", "I am now in onDestroy()!!")
    }
}