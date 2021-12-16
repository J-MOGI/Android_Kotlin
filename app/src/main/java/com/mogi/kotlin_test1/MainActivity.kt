package com.mogi.kotlin_test1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mogi.kotlin_test1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tv.setOnClickListener{view ->
            startActivity(Intent(this@MainActivity, SubActivity::class.java))
            finish()
        }
    }
}