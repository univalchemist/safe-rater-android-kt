package com.example.saferater.utils.ext

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.view.View
import android.view.WindowManager
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Activity.makeStatusBarTransparent() {
    window.apply {
        clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        statusBarColor = Color.TRANSPARENT
    }
}
