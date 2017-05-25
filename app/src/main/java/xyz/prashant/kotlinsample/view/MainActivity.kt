package xyz.prashant.kotlinsample.view

import android.widget.Toast
import co.prashantwosti.kotlinsample.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import xyz.prashant.kotlinsample.R
import xyz.prashant.kotlinsample.network.UserDetailResponse
import xyz.prashant.kotlinsample.presenter.MainImpl
import xyz.prashant.kotlinsample.presenter.MainPresenter

/**
 * Created by prashantwosti on 5/19/2017.
 */

class MainActivity : BaseActivity(), MainView {

    var presenter: MainPresenter? = null

    override val layout: Int
        get() = R.layout.activity_main

    override fun initView() {

        presenter = MainImpl(this)

        btn_press.setOnClickListener {
            presenter?.loadData("prashantwosti")
        }
    }

    override fun onDataLoaded(message: UserDetailResponse) {
        btn_press.text = "Yo! ${message.name}"
        textView_message.text = message.toString()
    }

    override fun onError(error: String) {
        textView_message.text = error
        Toast.makeText(this, "Oops! $error", Toast.LENGTH_SHORT).show()
    }

}
