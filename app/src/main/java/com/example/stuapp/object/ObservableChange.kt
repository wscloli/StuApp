package com.example.stuapp.`object`

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/20
 */
class ObservableChange : Observable {
    var obserList = mutableListOf<Observer>()
    override fun add(observer: Observer) {
        obserList.add(observer)
    }

    override fun remove(observer: Observer) {
        obserList.remove(observer)
    }

    override fun change(observer: Observer) {
        for (obj in obserList.listIterator()){
            obj.update("data")
        }
    }
}