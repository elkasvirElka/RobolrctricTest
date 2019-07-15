package com.example.robolectrictest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hello_textview =  findViewById<TextView>(R.id.hello_textview)
        hello_textview.setText("Тест")
    }
}
