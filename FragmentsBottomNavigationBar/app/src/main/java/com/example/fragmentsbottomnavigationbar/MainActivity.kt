package com.example.fragmentsbottomnavigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView.OnItemSelectedListener
import androidx.fragment.app.commit
import com.example.fragmentsbottomnavigationbar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNavigationView.setOnItemSelectedListener(this)
    }

    private fun onRunningClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_layout, RunningFragment())
        }
    }

    private fun onCyclingClicked() {
        supportFragmentManager.commit {
            replace(R.id.fragment_container_layout, CyclingFragment())
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.nav_cycling) {
            onCyclingClicked()
            true
        } else if (item.itemId == R.id.nav_running) {
            onRunningClicked()
            true
        } else {
            false
        }
    }
}

