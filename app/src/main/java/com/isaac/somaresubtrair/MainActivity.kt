package com.isaac.somaresubtrair

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun somar(view: View) {
        val counter = findViewById<TextView>(R.id.counter)
        val counterText = counter.text.toString()
        var counterNumber = counterText.toInt()

        counterNumber += 1
        counter.text = counterNumber.toString()
    }

    fun subtrair(view: View) {
        val counter = findViewById<TextView>(R.id.counter)
        val counterText = counter.text.toString()
        var counterNumber = counterText.toInt()

        counterNumber -= 1
        counter.text = counterNumber.toString()
    }
}