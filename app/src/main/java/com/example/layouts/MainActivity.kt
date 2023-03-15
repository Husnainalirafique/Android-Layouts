package com.example.layouts

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#005A8A")))
        //statusBar
        handlingStatusBar()
        binding.buttonToTableLayout.setOnClickListener {
            val intent = Intent(this, LearningTableLayout::class.java)
            startActivity(intent)
        }
        binding.buttonToFrameLayout.setOnClickListener {
            val intent = Intent(this, LearningFrameLayout::class.java)
            startActivity(intent)
        }
        binding.buttonToConstraintLayout.setOnClickListener {
            val intent = Intent(this,LearningConstraintLayout::class.java)
            startActivity(intent)
        }
    }

    private fun handlingStatusBar() {
        val window = window
        window.statusBarColor = ContextCompat.getColor(this, R.color.flight_bg)

    }
}