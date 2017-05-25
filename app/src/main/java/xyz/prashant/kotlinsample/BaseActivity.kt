package co.prashantwosti.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by prashantwosti on 5/19/2017.
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        initView()
    }

    protected abstract fun initView()

    protected abstract val layout: Int


}
