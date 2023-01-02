package com.example.helpfilesenddata



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var etId: EditText
    private lateinit var etName: EditText
    private lateinit var etRoll: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etId = findViewById(R.id.etId)
        etName = findViewById(R.id.etName)
        etRoll = findViewById(R.id.etRoll)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("id", etId.text.toString())
            bundle.putString("name", etName.text.toString())
            bundle.putString("roll", etRoll.text.toString())

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
