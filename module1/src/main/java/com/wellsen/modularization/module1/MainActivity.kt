package com.wellsen.modularization.module1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/module1/mainActivity")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("wellsen","模块1主界面调起")
        setContentView(R.layout.module1_activity_main)
    }
}
