package com.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.layouts.databinding.ActivityLearningTableLayoutBinding
import com.example.layouts.databinding.ActivityMainBinding

class LearningTableLayout : AppCompatActivity() {
    private lateinit var binding : ActivityLearningTableLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearningTableLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}