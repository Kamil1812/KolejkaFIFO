package com.example.kolejkafifo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // KAMIL NIEWIADOMSKI 3pr-T5

        findViewById<Button>(R.id.btn_add).setOnClickListener {
            val value = findViewById<TextInputLayout>(R.id.textInputLayout).toString()
            val value_num = value.toInt()
            val tab : Array<Int> = arrayOf()
        }
    }
}