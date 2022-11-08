package com.example.kolejkafifo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var value = findViewById<TextInputEditText>(R.id.myEditText).text.toString().toIntOrNull()

        // KAMIL NIEWIADOMSKI 3pr-T5
        val i = 0

        val queue: Queue<Int> = LinkedList<Int>()

        findViewById<Button>(R.id.btn_add).setOnClickListener {
            queue.add(findViewById<EditText>(R.id.myEditText).text.toString().toInt())
        }
    }
}