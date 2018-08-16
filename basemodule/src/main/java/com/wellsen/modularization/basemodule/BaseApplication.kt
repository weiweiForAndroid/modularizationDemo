package com.wellsen.modularization.basemodule

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

/**
create by wellsen at 2018/8/16  11:27

 */
open class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("wellsen", "全局 application OnCreate")

        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog()     // 打印日志
            ARouter.openDebug()  // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this) // 尽可能早，推荐在Application中初始化
    }
}