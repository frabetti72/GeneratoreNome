package com.example.generatorenome.presenter

import android.os.Bundle
import com.example.generatorenome.model.IModel
import com.example.generatorenome.model.Model
import com.example.generatorenome.view.IView
import com.example.generatorenome.view.MainActivity

class Presenter: IPresenter{
    lateinit var model: IModel
    override lateinit var view: IView

    override fun onCreate() {
        model= Model()
        model.presenter=this
    }

    override fun onRiscriviButtonClick(input: String){
        model.onRiscriviButtonClick(input)
    }
    override fun riscrivi(output: String){
        view.riscrivi(output)
    }
}