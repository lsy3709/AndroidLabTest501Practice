package com.busanit501.androidlabtest501.miniProject.test0709.msy0402_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.ch11_jetpack.recyclerview.test1simple.Ch11MyAdapterSample__msy0402
import com.busanit501.androidlabtest501.databinding.ActivityCh11MainRecyclerView1Check1Binding

class Ch11MainRecyclerView1Activity__msy0402 : AppCompatActivity() {
    lateinit var binding: ActivityCh11MainRecyclerView1Check1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCh11MainRecyclerView1Check1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Sample dummy data
        val datas = mutableListOf<String>()
        for (i in 1..10) {
            datas.add("오늘 점심 뭐먹지 ? $i")
        }

        // Set layout manager
        val layoutManager = LinearLayoutManager(this@Ch11MainRecyclerView1Activity__msy0402)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample1.layoutManager = layoutManager

        // Set adapter
        binding.ch11RecyclerSample1.adapter = Ch11MyAdapterSample__msy0402(datas)

        // Sample dummy data 2
        val datas2 = mutableListOf<String>()
        for (i in 1..10) {
            datas2.add("오늘 점심 뭐먹지2 ? $i")
        }

        // Set layout manager and adapter for the second RecyclerView
        val layoutManager2 = LinearLayoutManager(this@Ch11MainRecyclerView1Activity__msy0402)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample2.layoutManager = layoutManager2
        binding.ch11RecyclerSample2.adapter = Ch11MyAdapterSample__msy0402(datas2)

        // Sample dummy data 3
        val datas3 = mutableListOf<String>()
        for (i in 1..10) {
            datas3.add("문수연 숙제제출 ? $i")
        }

        // Set layout manager and adapter for the third RecyclerView
        val layoutManager3 = LinearLayoutManager(this@Ch11MainRecyclerView1Activity__msy0402)
        layoutManager3.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample3.layoutManager = layoutManager3
        binding.ch11RecyclerSample3.adapter = Ch11MyAdapterSample__msy0402(datas3)
    }
}
