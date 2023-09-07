package com.example.stuapp.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 *
 *@Auther MikuCat
 *@Time 2023/8/22
 */
class TestService : Service() {
    override fun onCreate() {
        super.onCreate()
    }
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}