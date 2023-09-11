package com.example.stuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.stuapp.databinding.ActivityShowImageBinding
import com.example.stuapp.http.RetrofitManager
import com.example.stuapp.utils.GlideUtils
import kotlinx.coroutines.launch

class ShowImageActivity : AppCompatActivity() {
    private var mBinding: ActivityShowImageBinding? = null
    private val mViewModel: ShowImageViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityShowImageBinding.inflate(layoutInflater)
        setContentView(mBinding?.root)

        getData()
        mBinding?.showImg?.setOnClickListener {
            getData()
        }
    }

    private fun getData(){
        lifecycleScope.launch {
            RetrofitManager.apiService.getImg(false).let {
                mBinding?.showImg?.let { it1 ->
                    GlideUtils.showImage(it1, it.data[0].url, this@ShowImageActivity)
                }
            }
        }
    }
}