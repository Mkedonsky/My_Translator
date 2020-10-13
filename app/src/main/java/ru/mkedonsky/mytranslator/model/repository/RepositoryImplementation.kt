package ru.mkedonsky.mytranslator.model.repository

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.model.datasource.DataSource

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}
