package com.example.selfpromoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.selfpromoapp.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    private lateinit var message: Message
    private lateinit var messagePreviewText: String

    private lateinit var binding: ActivityPreviewBinding
    @Suppress("DEPRECATION")
//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        displayMessage()

        setUpButton()
    }

    private fun displayMessage() {
        message = intent.getSerializableExtra("Message") as Message

        //        val message = intent.getSerializableExtra("Message", Message::class.java)

        messagePreviewText = """
                
                Hi, ${message.contactName},
                My name is ${message.myDisplayName} and I am ${message.getFullJobDescription()}.
                I have a portfolio of apps to demonstrate my technical skills
                that I can show on request.
                I am able to start a new position ${message.getAvailability()}.
                Please, get in touch if you have any suitable roles for me.
                Thanks and best regards.
                
            """.trimIndent()

        binding.textViewMessage.text = messagePreviewText
    }

    private  fun setUpButton() {
        binding.buttonSendMessage.setOnClickListener {
            // Send message intent
        }
    }
}



