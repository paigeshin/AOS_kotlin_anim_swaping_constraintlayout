package com.paigesoftware.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class SwapAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    @RequiresApi(Build.VERSION_CODES.KITKAT)
    fun swapView(view: View) {
        TransitionManager.beginDelayedTransition(layout)
        placeHolder.setContentId(view.id)
    }

}