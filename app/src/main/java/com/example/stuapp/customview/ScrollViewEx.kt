package com.example.stuapp.customview

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.ViewGroup
import android.widget.Scroller
import kotlin.math.abs

/**
 *
 *@Auther MikuCat
 *@Time 2023/8/20
 */
class ScrollViewEx : ViewGroup {
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

    //上次滑动的坐标
    private var mLastX = 0
    private var mLastY = 0

    //分别记录上次滑动的坐标
    private var mLastXIntercept: Float = 0.0f
    private var mLastYIntercept: Float = 0.0f
    private var mScroller: Scroller? = null
    private var mVelocityTracker: VelocityTracker? = null //滑动

    private fun init() {
        mScroller = Scroller(context)
        mVelocityTracker = VelocityTracker.obtain()
    }

    override fun onInterceptHoverEvent(event: MotionEvent?): Boolean {
        var intercepted: Boolean = false  //是否拦截
        var x: Float = event?.x ?: 0.0f
        var y: Float = event?.y ?: 0.0f

        when (event?.action) {
            MotionEvent.ACTION_DOWN -> {
                intercepted = false
                if (mScroller?.isFinished != true) {
                    mScroller?.abortAnimation()
                    intercepted = true
                }
            }

            MotionEvent.ACTION_MOVE -> {
                var deltaX: Float = x.minus(mLastXIntercept)
                var deltaY: Float = y.minus(mLastYIntercept)
                if (Math.abs(deltaX) > abs(deltaY)) {
                    intercepted = true

                }
            }

        }


        return super.onInterceptHoverEvent(event)
    }

    override fun onLayout(p0: Boolean, p1: Int, p2: Int, p3: Int, p4: Int) {

    }
}