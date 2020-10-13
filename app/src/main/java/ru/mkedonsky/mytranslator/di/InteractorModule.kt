package ru.mkedonsky.mytranslator.di

import dagger.Module
import dagger.Provides
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.model.repository.Repository
import ru.mkedonsky.mytranslator.view.main.MainInteractor
import javax.inject.Named

@Module
class InteractorModule {

    @Provides
    internal fun provideInteractor(
        @Named(NAME_REMOTE) repositoryRemote: Repository<List<DataModel>>,
        @Named(NAME_LOCAL) repositoryLocal: Repository<List<DataModel>>
    ) = MainInteractor(repositoryRemote, repositoryLocal)
}