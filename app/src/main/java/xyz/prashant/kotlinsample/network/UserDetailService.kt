package xyz.prashant.kotlinsample.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by prashantwosti on 5/22/2017.
 */
class UserDetailService {

    val userDetailApi: UserDetailApi

    init {
        userDetailApi = RetrofitAdapter().provideRetrofit().create(UserDetailApi::class.java)
    }


    interface UserDetailApi {
        @GET("users/{username}")
        fun getUserDetail(@Path("username") username: String): Observable<UserDetailResponse>
    }

    fun createApi(): UserDetailApi {
        return userDetailApi
    }

}