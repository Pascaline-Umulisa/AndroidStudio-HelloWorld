package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnmoney: Button
    lateinit var btnBMI:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI=findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent=Intent(this,BMI::class.java)
            startActivity(intent)
        }

        btnmoney = findViewById(R.id.btnmoney)
        btnmoney.setOnClickListener {
            val intent = Intent(this, SendMoney::class.java)
            startActivity(intent)
        }
    }
}