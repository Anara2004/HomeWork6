package com.example.homework6android11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6android11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container_fragment, MainFragment())
            .commit()
    }
}