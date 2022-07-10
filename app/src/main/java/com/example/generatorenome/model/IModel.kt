package com.example.generatorenome.model

import com.example.generatorenome.presenter.IPresenter

interface IModel {
    var presenter: IPresenter

    fun onRiscriviButtonClick(input: String)
    //fun riscrivi(output: String)
}