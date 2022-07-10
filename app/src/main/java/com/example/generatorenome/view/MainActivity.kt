package com.example.generatorenome.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.TextView
import com.example.generatorenome.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val casellaTesto: TextView= findViewById(R.id.textView)

        val ourText: TextInputEditText = findViewById(R.id.ourTextBox)
        //val ourText: TextInputEditText = R.id.ourTextBox

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            onButtonClick(ourText)
        }

    }

    fun onButtonClick(ourText: TextInputEditText){
        var textInputContent: Editable? = ourText.text
    }
}