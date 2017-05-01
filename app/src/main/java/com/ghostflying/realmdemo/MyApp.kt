package com.ghostflying.realmdemo

import android.app.Application
import io.realm.Realm

/**
 * Created by ghostflying on 2017/5/1.
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }
}