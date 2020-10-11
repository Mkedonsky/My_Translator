package ru.mkedonsky.mytranslator.view.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.mkedonsky.mytranslator.model.data.DataModel
import ru.mkedonsky.mytranslator.presenter.Presenter

abstract class BaseActivity<T : DataModel> : AppCompatActivity(), View {

    protected lateinit var presenter: Presenter<T, View>

    protected abstract fun createPresenter(): Presenter<T, View>

    abstract override fun renderData(dataModel: DataModel)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = createPresenter()
    }

    override fun onStart() {
        super.onStart()
        presenter.attachView(this)
    }

    override fun onStop() {
        super.onStop()
        presenter.detachView(this)
    }
}
