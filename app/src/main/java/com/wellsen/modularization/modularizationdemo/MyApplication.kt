package com.wellsen.modularization.modularizationdemo

import android.util.Log
import com.wellsen.modularization.basemodule.BaseApplication

/**
create by wellsen at 2018/8/16  11:18

 */
class MyApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        Log.e("wellsen", "主工程 application OnCreate")
    }

}