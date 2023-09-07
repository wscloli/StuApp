package com.example.stuapp.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/3
 */
class BaseActivity<VM : ViewModel, VB : ViewDataBinding > : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }
}