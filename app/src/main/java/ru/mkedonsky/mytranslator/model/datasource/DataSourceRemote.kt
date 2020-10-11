package ru.mkedonsky.mytranslator.model.datasource

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.SearchResult

class DataSourceRemote(private val remoteProvider: RetrofitImplementation = RetrofitImplementation()) :
    DataSource<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> = remoteProvider.getData(word)
}