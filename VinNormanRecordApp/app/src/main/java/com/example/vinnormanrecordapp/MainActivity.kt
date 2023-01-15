package com.example.vinnormanrecordapp


import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.vinnormanrecordapp.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNav.setOnItemSelectedListener(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.reset_running_records -> {
            Toast.makeText(
                this, "Gocho deleted Running Records",
                Toast.LENGTH_LONG
            ).show()
            true
        }
        R.id.reset_cycling_records -> {
            Toast.makeText(
                this, "Gocho deleted Cycling Records",
                Toast.LENGTH_LONG
            ).show()
            true
        }
        R.id.reset_all_records -> {
            Toast.makeText(
                this, "Gocho deleted ALL Records",
                Toast.LENGTH_LONG
            ).show()
            true
        }
        else -> super.onOptionsItemSelected(item)
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

    override fun onNavigationItemSelected(item: MenuItem) = when (item.itemId) {
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

