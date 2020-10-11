package ru.mkedonsky.mytranslator.view.base

import ru.mkedonsky.mytranslator.model.data.DataModel

interface View {

    fun renderData(dataModel: DataModel)

}