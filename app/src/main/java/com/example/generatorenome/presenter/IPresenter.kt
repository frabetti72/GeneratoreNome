package com.example.generatorenome.presenter

import com.example.generatorenome.view.IView

interface IPresenter {
    var view: IView

    fun onCreate()
    fun onRiscriviButtonClick(input: String)
    fun riscrivi(output: String)
}