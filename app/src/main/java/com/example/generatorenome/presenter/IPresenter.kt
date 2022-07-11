package com.example.generatorenome.presenter

import com.example.generatorenome.model.IModel
import com.example.generatorenome.view.IView

interface IPresenter {
    val model: IModel

    fun onRiscriviButtonClick(input: String)
    fun riscrivi(output: String)
}