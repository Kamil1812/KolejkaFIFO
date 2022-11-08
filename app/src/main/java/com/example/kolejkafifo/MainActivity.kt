package com.example.kolejkafifo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val stack = ArrayDeque<Int>()
        val text = findViewById<EditText>(R.id.myEditText)
        val output = findViewById<TextView>(R.id.TextView_wynik)

        findViewById<Button>(R.id.btn_push_back).setOnClickListener {
            stack.add(text.text.toString().toInt())
            text.text.clear()
        }

        findViewById<Button>(R.id.btn_first).setOnClickListener {
            if(!stack.isEmpty())
                output.text = stack.last().toString()
        }

        findViewById<Button>(R.id.btn_last).setOnClickListener{
            if(!stack.isEmpty())
                output.text = stack.first().toString()
        }

        findViewById<Button>(R.id.btn_size).setOnClickListener {
            if(!stack.isEmpty())
                output.text = stack.size.toString()
        }

        findViewById<Button>(R.id.btn_pop_back).setOnClickListener {
            if(!stack.isEmpty())
                stack.removeLast()
        }

    }
}