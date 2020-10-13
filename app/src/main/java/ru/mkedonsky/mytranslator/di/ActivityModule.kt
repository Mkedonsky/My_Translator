package ru.mkedonsky.mytranslator.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.mkedonsky.mytranslator.view.main.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}