package com.example.stuapp.LRU

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/24
 */
class LRUCache constructor(var capacity : Int){
    var cache : LinkedHashMap<Int,Int> = LinkedHashMap()
    /*fun get(key : Int) : Int{
        if (cache.containsKey(key)){
            return -1
        }else{
            
        }
    }*/

}