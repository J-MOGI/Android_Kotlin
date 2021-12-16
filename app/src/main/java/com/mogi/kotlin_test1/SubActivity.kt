package com.mogi.kotlin_test1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mogi.kotlin_test1.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}