package ru.mkedonsky.mytranslator.model.repository

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.SearchResult
import ru.mkedonsky.mytranslator.model.datasource.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<SearchResult>>) :
    Repository<List<SearchResult>> {

    override fun getData(word: String): Observable<List<SearchResult>> {
        return dataSource.getData(word)
    }
}
