package com.example.firstkotlinapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.firstkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var editTextName: EditText
//    private lateinit var textViewName: TextView
//    private lateinit var buttonSave: Button


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//
//        editTextName = findViewById(R.id.editTextName)
//        textViewName = findViewById(R.id.textViewName)
//        buttonSave = findViewById(R.id.buttonSave)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonSave.setOnClickListener { binding.textViewName.text = "Привет, ${binding.editTextName.text.toString().trim()}" }
    }
}