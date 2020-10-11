package ru.mkedonsky.mytranslator.view.main

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.model.data.SearchResult
import ru.mkedonsky.mytranslator.model.repository.Repository
import ru.mkedonsky.mytranslator.presenter.Interactor

class MainInteractor(
    private val remoteRepository: Repository<List<SearchResult>>,
    private val localRepository: Repository<List<SearchResult>>
) : Interactor<DataModel> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<DataModel> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { DataModel.Success(it) }
        } else {
            localRepository.getData(word).map { DataModel.Success(it) }
        }
    }
}