package com.example.robolectrictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hello_textview =  findViewById<TextView>(R.id.hello_textview)
      //TODO если раскоминтить эту строчку, то тест RobolectricTestRunner свалится
        //  hello_textview.text = "Тест"
    }
}
