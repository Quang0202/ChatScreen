package com.vaibhavmojidra.androidkotlindemoviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaibhavmojidra.androidkotlindemoviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.greetButton.setOnClickListener {
            binding.greetTextView.text="Hello ${binding.nameEditTextText.text}"
        }
    }
}