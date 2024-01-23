package com.example.counter52.view

import com.example.counter52.model.CounterModel

class Presenter(private var view: CounterView) {

    private var model = CounterModel()

    fun increment() {
        model.increment()
        view.showNewCount(model.number)
    }

    fun decrement() {
        model.decrement()
        view.showNewCount(model.number)
    }

}