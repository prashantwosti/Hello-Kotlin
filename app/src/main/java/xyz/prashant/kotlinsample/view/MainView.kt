package xyz.prashant.kotlinsample.view

import xyz.prashant.kotlinsample.network.UserDetailResponse


/**
 * Created by prashantwosti on 5/19/2017.
 */

interface MainView {

    fun onDataLoaded(message: UserDetailResponse)

    fun onError(error: String)
}