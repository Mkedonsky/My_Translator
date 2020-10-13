package ru.mkedonsky.mytranslator.di

import dagger.Module
import dagger.Provides
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.model.datasource.DataSource
import ru.mkedonsky.mytranslator.model.datasource.RetrofitImplementation
import ru.mkedonsky.mytranslator.model.datasource.RoomDB
import ru.mkedonsky.mytranslator.model.repository.Repository
import ru.mkedonsky.mytranslator.model.repository.RepositoryImplementation
import javax.inject.Named
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideRepositoryRemote(@Named(NAME_REMOTE) dataSourceRemote: DataSource<List<DataModel>>): Repository<List<DataModel>> =
        RepositoryImplementation(dataSourceRemote)

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideRepositoryLocal(@Named(NAME_LOCAL) dataSourceLocal: DataSource<List<DataModel>>): Repository<List<DataModel>> =
        RepositoryImplementation(dataSourceLocal)

    @Provides
    @Singleton
    @Named(NAME_REMOTE)
    internal fun provideDataSourceRemote(): DataSource<List<DataModel>> =
        RetrofitImplementation()

    @Provides
    @Singleton
    @Named(NAME_LOCAL)
    internal fun provideDataSourceLocal(): DataSource<List<DataModel>> = RoomDB()
}
