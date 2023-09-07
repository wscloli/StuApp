package com.example.stuapp.`object`

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/20
 */
interface Observable {
    fun add(observer : Observer)
    fun remove(observer: Observer)
    fun change(observer: Observer)
}