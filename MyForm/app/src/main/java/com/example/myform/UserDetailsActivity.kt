package com.example.myform

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myform.databinding.ActivityUserDetailsBinding

class UserDetails : AppCompatActivity() {

    private lateinit var summary: Summary
    private lateinit var email: String
    private lateinit var phone: String
    private lateinit var summaryContent: String
    private lateinit var binding: ActivityUserDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        displaySummary()

        sendEmail()

        dialPhone()

    }

    private fun sendEmail() {
        binding.textViewEmail.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
//                val addresses = "bocho@dochev"
//                putExtra(Intent.EXTRA_EMAIL, addresses)
//                val subject = "greetings"
//                putExtra(Intent.EXTRA_SUBJECT, subject)
            }
            startActivity(intent)
        }
    }


    private fun dialPhone() {
        binding.textViewPhone.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL).apply {
                val phoneNumber = binding.textViewPhone.text
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        }
    }


    @Suppress("DEPRECATION")
    private fun displaySummary() {
        summary = intent.getSerializableExtra("Summary") as Summary
        email = intent.getStringExtra("Email").toString()
        phone = intent.getStringExtra("Phone").toString()

        summaryContent = """
           ${summary.title} ${summary.firstName} ${summary.lastName}
        """.trimIndent()

        binding.textViewSummary.text = summaryContent
        binding.textViewEmail.text = email
        binding.textViewPhone.text = phone
    }
}