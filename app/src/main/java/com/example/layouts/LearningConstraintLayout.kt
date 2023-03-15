package com.example.layouts

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class LearningConstraintLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_constraint_layout)
        supportActionBar?.hide()
        //statusBar
        handlingStatusBar()
    }
    private fun handlingStatusBar() {
        val window = window
        window.statusBarColor = ContextCompat.getColor(this, R.color.constraintStatusBar_bg)

    }
}