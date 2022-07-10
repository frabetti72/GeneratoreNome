package com.example.generatorenome.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.generatorenome.R
import com.example.generatorenome.presenter.IPresenter
import com.example.generatorenome.presenter.Presenter

class MainActivity : AppCompatActivity(), IView {
    lateinit var ourText: EditText
    lateinit var displayText: TextView
    lateinit var button:Button
    lateinit var presenter: IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        displayText= findViewById(R.id.textView)
        ourText= findViewById(R.id.ourText)
        button= findViewById(R.id.button)
        button.setOnClickListener {
            onRiscriviButtonClick()
        }

        presenter= Presenter(this)

    }

    override fun onRiscriviButtonClick(){
        presenter.onRiscriviButtonClick(ourText.editableText.toString())
    }
    override fun riscrivi(output: String){
        this.displayText.text=output
    }
}