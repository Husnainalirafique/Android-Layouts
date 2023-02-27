package com.example.layouts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.core.content.ContextCompat
import com.example.layouts.databinding.ActivityLearningTableLayoutBinding
import com.example.layouts.databinding.ActivityMainBinding

class LearningTableLayout : AppCompatActivity() {
    private lateinit var binding : ActivityLearningTableLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearningTableLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()

        //playing with status bar
        statusBar()
    }

    private fun statusBar() {
        val window = this.window
        window.statusBarColor = ContextCompat.getColor(this,R.color.orange)
    }


}