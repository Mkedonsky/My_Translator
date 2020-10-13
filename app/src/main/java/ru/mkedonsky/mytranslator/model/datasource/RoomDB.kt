package ru.mkedonsky.mytranslator.model.datasource

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.DataModel

class RoomDB : DataSource<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}