package ru.mkedonsky.mytranslator.view.main

import io.reactivex.Observable
import ru.mkedonsky.mytranslator.di.NAME_LOCAL
import ru.mkedonsky.mytranslator.di.NAME_REMOTE
import ru.mkedonsky.mytranslator.model.data.AppState
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.model.repository.Repository
import ru.mkedonsky.mytranslator.viewmodel.Interactor
import javax.inject.Inject
import javax.inject.Named

class MainInteractor @Inject constructor(
    @Named(NAME_REMOTE) val repositoryRemote: Repository<List<DataModel>>,
    @Named(NAME_LOCAL) val repositoryLocal: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            repositoryRemote
        } else {
            repositoryLocal
        }.getData(word).map { AppState.Success(it) }
    }
}