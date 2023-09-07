package com.example.stuapp.style

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface

/**
 *
 *@Auther MikuCat
 *@Time 2023/7/12
 */
class TextDialog : Dialog {
    constructor(context: Context) : super(context)
    constructor(context: Context, themeResId: Int) : super(context, themeResId)
    constructor(
        context: Context,
        cancelable: Boolean,
        cancelListener: DialogInterface.OnCancelListener?
    ) : super(context, cancelable, cancelListener)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

    }
}