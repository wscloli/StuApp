package com.example.stuapp.utils

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import okhttp3.internal.wait

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/3
 */
class GlideUtils {
    companion object {
        fun showImage(view: ImageView, path: String, context: Context) {
            Glide.with(context)
                .load(path)
                .into(view)
        }

    }
}