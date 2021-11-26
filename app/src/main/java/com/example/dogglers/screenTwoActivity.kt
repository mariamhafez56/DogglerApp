package com.example.dogglers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ListAdapter
import com.example.dogglers.data.DataSource
import com.example.dogglers.databinding.ActivityScreenTwoBinding
import com.example.dogglers.model.Dogs

class screenTwoActivity : AppCompatActivity() {

    lateinit var binding : ActivityScreenTwoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_two)

        binding = ActivityScreenTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list : List<Dogs> = DataSource().dogglers()

        binding.recyclerview.layoutManager = LinearLayoutManager(this , RecyclerView.VERTICAL , false)
        

        binding.recyclerview.adapter = ListAdapter(this , list)
        binding.recyclerview.setHasFixedSize(true)
    }
}