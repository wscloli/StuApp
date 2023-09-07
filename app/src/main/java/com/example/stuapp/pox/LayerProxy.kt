package com.example.stuapp.pox

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/19
 */
class LayerProxy : InvocationHandler{
    var layer: Layer? = null;

    constructor(layer: Layer) {
        this.layer = layer
    }

    fun play() {
        layer?.play()
    }


    override fun invoke(p0: Any?, p1: Method?, p2: Array<out Any>?): Any? {
       var obj = p1?.invoke(layer,p2)
        return obj
    }
}