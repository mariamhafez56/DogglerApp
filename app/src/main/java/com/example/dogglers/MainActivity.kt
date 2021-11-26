package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ListAdapter
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.ActivityMainBinding
import com.example.dogglers.databinding.ActivityScreenTwoBinding
import com.example.dogglers.model.Dogs

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vertical.setOnClickListener {
            val intent = Intent(this , screenTwoActivity::class.java)

            startActivity(intent)
        }
        binding.horizontal.setOnClickListener {
            val intent = Intent(this , thirdScreenActivity::class.java)

            startActivity(intent)
        }
        binding.grid.setOnClickListener {
            val intent = Intent(this , gridScreenActivity::class.java)

            startActivity(intent)
        }

    }
}