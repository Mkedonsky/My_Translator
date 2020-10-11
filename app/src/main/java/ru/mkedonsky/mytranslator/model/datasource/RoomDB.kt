package ru.mkedonsky.mytranslator.model.datasource

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.SearchResult

class RoomDB : DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}