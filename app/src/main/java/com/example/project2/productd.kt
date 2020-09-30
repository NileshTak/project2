package com.example.project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class productd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productd)


        val button = findViewById<ImageView>(R.id.imageView22)
        button.setOnClickListener {
            val intent = Intent(this, productd2::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<ImageView>(R.id.imageView26)
        button2.setOnClickListener{
            val intent = Intent(this, productd3::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<ImageView>(R.id.imageView16)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}