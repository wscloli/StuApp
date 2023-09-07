package com.example.stuapp

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.stuapp.pox.Layer
import com.example.stuapp.pox.LayerProxy
import com.example.stuapp.pox.Wang
import com.example.stuapp.style.CreateFactory
import com.example.stuapp.style.CreatePhone

class MainActivity : AppCompatActivity(),LifecycleObserver {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init(){
        val phone = CreatePhone()
        val mi = phone.createMiProduct()
        val apple = phone.createAppleProduct()
        mi.miStyle()
        apple.iosStyle()

        var wang : Layer = Wang()
        var layerProxy = LayerProxy(wang)
        layerProxy.play()

//        var pendingInt : PendingIntent = Intent(this)
    }

    override fun onStart() {
        super.onStart()

    }

}