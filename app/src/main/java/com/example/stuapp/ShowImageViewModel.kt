package com.example.stuapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.lifecycle.ViewModel

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/3
 */
class ShowImageViewModel : ViewModel(){

}
class data : BaseObservable(){
    @get:Bindable
    var getPath : String = ""
        set(value){
            field = value
            notifyPropertyChanged(BR.getPath)
        }
}
