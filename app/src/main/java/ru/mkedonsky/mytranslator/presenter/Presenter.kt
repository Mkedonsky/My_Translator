package ru.mkedonsky.mytranslator.presenter


import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.view.base.View

interface Presenter<T : DataModel, V : View> {

    fun attachView(view: V)
    fun detachView(view: V)
    fun getData(word: String, isOnline: Boolean)
}