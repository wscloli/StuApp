package com.example.stuapp.http.response

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/2
 */
data class BannerResponse(
    var success: Boolean = false,
    val data: List<ImgData>
)

data class ImgData(
    val pid: String = "",
    val url: String = ""
)
