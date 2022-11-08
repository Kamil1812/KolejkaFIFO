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
        var value = findViewById<TextInputEditText>(R.id.myEditText).text.toString().toIntOrNull()

        // KAMIL NIEWIADOMSKI 3pr-T5
        val i = 0

        val queue: Queue<Int> = LinkedList<Int>()
        val text = findViewById<EditText>(R.id.myEditText)
        val output = findViewById<TextView>(R.id.TextView_wynik)

        findViewById<Button>(R.id.btn_add).setOnClickListener {
            queue.add(text.text.toString().toInt())
        }

        findViewById<Button>(R.id.btn_wykonaj).setOnClickListener {


            if (findViewById<RadioButton>(R.id.rb_first).isChecked)
            {
                output.text = queue.first().toString()
            }

            if (findViewById<RadioButton>(R.id.rb_last).isChecked)
            {
                output.text = queue.last().toString()
            }

            if (findViewById<RadioButton>(R.id.rb_size).isChecked)
            {
                output.text = queue.size.toString()
            }

            if (findViewById<RadioButton>(R.id.rb_push_back).isChecked)
            {

            }

            if (findViewById<RadioButton>(R.id.rb_pop_back).isChecked)
            {

            }
        }

    }
}