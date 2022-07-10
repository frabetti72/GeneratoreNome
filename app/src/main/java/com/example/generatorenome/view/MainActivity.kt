package com.example.generatorenome.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.generatorenome.R
import com.example.generatorenome.presenter.IPresenter
import com.example.generatorenome.presenter.Presenter
import com.google.android.material.textfield.TextInputEditText

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
        //presenter.onCreate()//questo dovrebbe essere automatico

    }
    /*
    fun onButtonClick(){
        var textInputContent: Editable? = ourText.editableText
        this.displayText.text=this.ourText.editableText.toString()

    }
    */

    override fun onRiscriviButtonClick(){
        presenter.onRiscriviButtonClick(ourText.editableText.toString())
    }
    override fun riscrivi(output: String){
        this.displayText.text=output
    }
}