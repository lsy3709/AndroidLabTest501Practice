package com.busanit501.androidlabtest501.miniProject.test0709.lsj0918_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.ch11_jetpack.recyclerview.test1simple.Ch11MyAdapterSample2_msy0402
import com.busanit501.androidlabtest501.ch11_jetpack.recyclerview.test1simple.lsj0918Ch11MyAdapterSample
import com.busanit501.androidlabtest501.ch11_jetpack.recyclerview.test1simple.lsj0918Ch11MyAdapterSample3
import com.busanit501.androidlabtest501.databinding.ActivityLsj0918Ch11MainRecyclerView1Binding

class lsj0918Ch11MainRecyclerView1Activity : AppCompatActivity() {
    lateinit var binding: ActivityLsj0918Ch11MainRecyclerView1Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLsj0918Ch11MainRecyclerView1Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_lsj0918_ch11_main_recycler_view1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //샘플 더미 데이터 넣기.
        val datas = mutableListOf<String>()
        for(i in 1..10) {
            datas.add("썸머송 추천1 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager = LinearLayoutManager(this@lsj0918Ch11MainRecyclerView1Activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.lsj0918ch11RecyclerSample.layoutManager = layoutManager

        // 어댑터 붙이기.
        binding.lsj0918ch11RecyclerSample.adapter = lsj0918Ch11MyAdapterSample(datas)

        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.2
        val datas2 = mutableListOf<String>()
        for(i in 1..10) {
            datas2.add("썸머송 추천2 ? $i")
        }


        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager2 = LinearLayoutManager(this@lsj0918Ch11MainRecyclerView1Activity)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.lsj0918ch11RecyclerSample2.layoutManager = layoutManager2

        // 어댑터 붙이기.
        binding.lsj0918ch11RecyclerSample2.adapter = Ch11MyAdapterSample2_msy0402(datas2)

        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.2
        val datas3 = mutableListOf<String>()
        for(i in 1..10) {
            datas3.add("썸머송 추천3 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager3 = LinearLayoutManager(this@lsj0918Ch11MainRecyclerView1Activity)
        layoutManager3.orientation = LinearLayoutManager.VERTICAL
        binding.lsj0918ch11RecyclerSample3.layoutManager = layoutManager3

        // 어댑터 붙이기.
        binding.lsj0918ch11RecyclerSample3.adapter = lsj0918Ch11MyAdapterSample3(datas3)


    } //onCreate
}