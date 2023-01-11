package com.example.recordkeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.commit
import com.example.recordkeeperapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        @Suppress("DEPRECATION")
//        binding.bottomNav.setOnNavigationItemSelectedListener (this)

        NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.nav_cycling -> {
                    onCyclingClicked()
                    true
                }
                R.id.nav_running -> {
                    onRunningClicked()
                    true
                }
                else -> false
            }
        }

    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.frame_content, CyclingFragment())
        }
    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        TODO("Not yet implemented")
//    }


//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == R.id.nav_cycling) {
//            onCyclingClicked()
//            return true
//        } else if (item.itemId == R.id.nav_running) {
//            onRunningClicked()
//            return true
//        } else {
//            return false
//        }
//    }

}