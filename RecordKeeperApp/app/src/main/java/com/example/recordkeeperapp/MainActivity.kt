package com.example.recordkeeperapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.recordkeeperapp.R.id.navigation_cycling
import com.example.recordkeeperapp.databinding.ActivityMainBinding
import com.example.recordkeeperapp.ui.cycling.CyclingFragment
import com.example.recordkeeperapp.ui.running.RunningFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCycling.setOnClickListener {
            onCyclingClicked()
        }

        binding.buttonRunning.setOnClickListener {
            onRunningClicked()
        }

//        val navView: BottomNavigationView = binding.navView
//
//        val navController = findNavController(R.id.nav_host_fragment_activity_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        val appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.navigation_running, navigation_cycling
//            )
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {

            replace(R.id.nav_host_fragment_activity_main, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {

            replace(R.id.nav_host_fragment_activity_main, CyclingFragment())
        }
    }
}