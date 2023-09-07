package com.example.stuapp

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.stuapp.utils.GlideUtils

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/3
 */
class TestViewBinding {

    companion object {
        @BindingAdapter(value = ["android:imgUrl"])
        fun setImgUrl(view: ImageView ,path : String = "https://sex.nyan.xyz/img-original/img/2022/05/30/00/00/11/98699738_p0.png") {
            GlideUtils.showImage(view,path,view.context)
        }
    }

}