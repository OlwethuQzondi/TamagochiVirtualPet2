package com.st10447525.tamagochivirtualpet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    //declaration
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    private lateinit var imageView: ImageView
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        textView =findViewById(R.id.textView)
        textView2 =findViewById(R.id.textView2)
        imageView =findViewById(R.id.imageView)
        button =findViewById(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this,Main3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}