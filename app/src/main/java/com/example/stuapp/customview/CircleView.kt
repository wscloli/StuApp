package com.example.stuapp.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 *
 *@Auther MikuCat
 *@Time 2023/8/17
 */
class CircleView : View {
    private var mColor = Color.RED
    private var mPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context?) : this(context, null)
    constructor(context: Context?, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init()
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init()
    }

    private fun init() {
        mPaint.color = mColor
    }

    override fun draw(canvas: Canvas?) {
        super.draw(canvas)
        var paddingLeft = paddingLeft
        var paddingRight = paddingRight
        var paddingTop = paddingTop
        var paddingBottom = paddingBottom


        /*var width: Float = width.toFloat()
        var height: Float = height.toFloat()
        var radius = Math.min(width, height) / 2*/
        var with = width - paddingLeft - paddingRight
        var height = height - paddingTop - paddingBottom
        var radius = Math.min(width, height) / 2
        canvas?.drawCircle(
            (paddingLeft + (width / 2)).toFloat(),
            (paddingTop + (height / 2)).toFloat(),
            radius.toFloat(),
            mPaint
        )
    }



}