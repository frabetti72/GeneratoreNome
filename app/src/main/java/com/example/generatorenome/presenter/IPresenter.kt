package com.example.generatorenome.presenter

import com.example.generatorenome.view.IView

interface IPresenter {

    fun onCreate()
    fun onRiscriviButtonClick(input: String)
    fun riscrivi(output: String)
}