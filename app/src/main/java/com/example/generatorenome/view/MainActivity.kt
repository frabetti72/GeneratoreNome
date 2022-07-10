package com.example.generatorenome.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
            onButtonClick(this.findViewById(R.id.ourTextBox),this.findViewById(R.id.textView) )

        }

    }

    fun onButtonClick(input: View,output: View){
        output.edit
    }
}