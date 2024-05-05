package com.st10447525.tamagochivirtualpet

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class Main3Activity : AppCompatActivity() {
    //declare
    private lateinit var Playtextbar: TextView
    private lateinit var Feedtextbar: TextView
    private lateinit var Cleantextbar: TextView
    private lateinit var imageView2: ImageView
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var Happinessbar: ProgressBar
    private lateinit var Feedbar: ProgressBar
    private lateinit var Cleanbar: ProgressBar

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //initialise
        imageView2=findViewById(R.id.imageView2)
        Playtextbar =findViewById(R.id.Playtextbar)
        Feedtextbar =findViewById(R.id.Feedtextbar)
        Cleantextbar =findViewById(R.id.Cleantextbar)
        button2 =findViewById(R.id.button2)
        button3 =findViewById(R.id.button3)
        button4 =findViewById(R.id.button4)
        Happinessbar =findViewById(R.id.Happinessbar)
        Feedbar =findViewById(R.id.Feedbar)
        Cleanbar =findViewById(R.id.Cleanbar)

        // increase the progressbar by 50

        button2.setOnClickListener{
        imageView2.setImageResource(R.drawable.img_2)
        Happinessbar.incrementProgressBy(50)
        }

        button3.setOnClickListener{
        imageView2.setImageResource(R.drawable.img_3)
        Feedbar.incrementProgressBy(50)

        }
        button4.setOnClickListener{
        imageView2.setImageResource(R.drawable.img_1)
        Cleanbar.incrementProgressBy(50)
        }
    }
}