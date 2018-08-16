package com.wellsen.modularization.modularizationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.tv).setOnClickListener {
            ARouter.getInstance().build("/module1/mainActivity").navigation()
//            var intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
        }
    }
}
