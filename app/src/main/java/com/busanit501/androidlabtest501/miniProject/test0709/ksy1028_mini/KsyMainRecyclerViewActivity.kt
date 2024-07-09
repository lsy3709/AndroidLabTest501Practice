package com.busanit501.androidlabtest501.miniProject.test0709.ksy1028_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.ch11_jetpack.recyclerview.test1simple.Ch11MyAdapterSample_msy0402
import com.busanit501.androidlabtest501.databinding.ActivityKsyMainRecyclerViewBinding


class KsyMainRecyclerViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityKsyMainRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityKsyMainRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_main_recycler_view1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //샘플 더미 데이터 넣기.
        val datas = mutableListOf<String>()
        for (i in 1..10) {
            datas.add("오늘 점심 뭐먹지 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager = LinearLayoutManager(this@KsyMainRecyclerViewActivity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample1.layoutManager = layoutManager

        // 어댑터 붙이기.
        binding.ch11RecyclerSample1.adapter = Ch11MyAdapterSample_msy0402(datas)


        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.2
        val datas2 = mutableListOf<String>()
        for (i in 1..10) {
            datas2.add("오늘 점심 뭐먹지2 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager2 = LinearLayoutManager(this@KsyMainRecyclerViewActivity)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample2.layoutManager = layoutManager2

        // 어댑터 붙이기.
        binding.ch11RecyclerSample2.adapter = Ch11MyAdapterSample2(datas2)

        // 3번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.3
        val datas3 = mutableListOf<String>()
        for (i in 1..10) {
            datas3.add("배고파요 $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager3 = LinearLayoutManager(this@KsyMainRecyclerViewActivity)
        layoutManager3.orientation = LinearLayoutManager.VERTICAL
        binding.ch11RecyclerSample3.layoutManager = layoutManager3

        // 어댑터 붙이기.
        binding.ch11RecyclerSample3.adapter = Ch11MyAdapterSample3(datas3)
    }
}