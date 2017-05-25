package xyz.prashant.kotlinsample.presenter

import android.app.Activity
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import xyz.prashant.kotlinsample.network.UserDetailService
import xyz.prashant.kotlinsample.view.MainView

/**
 * Created by prashantwosti on 5/19/2017.
 */

class MainImpl(activity: Activity) : MainPresenter {

    val TAG = "MainImpl"

    var mainView: MainView? = null

    init {
        if (activity is MainView) {
            mainView = activity
        } else {
            throw IllegalArgumentException("Must implement MainView")
        }
    }


    override fun loadData(username: String) {

        UserDetailService().createApi()
                .getUserDetail(username)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    response ->
                    Log.i(TAG, response.name)
                    mainView?.onDataLoaded(response)
                }, {
                    error ->
                    mainView?.onError(error.localizedMessage)
                })

    }


}


