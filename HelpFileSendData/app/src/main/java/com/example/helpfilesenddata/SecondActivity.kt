package com.example.helpfilesenddata


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var tvId : TextView
    lateinit var tvName : TextView
    lateinit var tvRoll : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        tvId = findViewById(R.id.tvId)
        tvName = findViewById(R.id.tvName)
        tvRoll= findViewById(R.id.tvRoll)

        val bundle = intent.extras

        if (bundle != null){
            val myMess = "id = ${bundle.getString("id")}, Name = ${bundle.getString("name")}, RollNo = ${
                bundle.getString("roll")
            }"

            tvId.text = myMess

//            tvName.text = "Name = ${bundle.getString("name")}"
//            tvRoll.text = "RollNo = ${bundle.getString("roll")}"
        }
    }
}
