package com.example.generatorenome.model

import com.example.generatorenome.presenter.IPresenter
import com.example.generatorenome.presenter.Presenter

class Model(var presenter: IPresenter): IModel {

    override fun onRiscriviButtonClick(input: String){
        val engine: IEngine= NameEngine
        var output= engine.calcola(input)
        riscrivi(output)
    }
    private fun riscrivi(output: String){
        presenter.riscrivi(output)
    }
}