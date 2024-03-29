package com.example.layouts

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.core.content.ContextCompat

class LearningFrameLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_frame_layout)
        supportActionBar?.hide()
        //statusBar
        handlingStatusBar()
    }

    private fun handlingStatusBar() {
        val window = window
        window.statusBarColor=ContextCompat.getColor(this,R.color.flight_bg)

    }

}