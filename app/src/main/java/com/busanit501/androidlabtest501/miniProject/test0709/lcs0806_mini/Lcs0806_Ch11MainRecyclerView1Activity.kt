package com.busanit501.androidlabtest501.miniProject.test0709.lcs0806_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityCh11Lcs0806MainRecyclerView1Binding

class Lcs0806_Ch11MainRecyclerView1Activity : AppCompatActivity() {
    lateinit var binding: ActivityCh11Lcs0806MainRecyclerView1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCh11Lcs0806MainRecyclerView1Binding.inflate(layoutInflater)
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
            datas.add("비도오고 참 피곤하다 그죠 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager = LinearLayoutManager(this@Lcs0806_Ch11MainRecyclerView1Activity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.lcs0806ch11RecyclerSample1.layoutManager = layoutManager

        // 어댑터 붙이기.
        binding.lcs0806ch11RecyclerSample1.adapter = Lcs0806_Ch11MyAdapterSample(datas)


        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        //샘플 더미 데이터 넣기.2
        val datas2 = mutableListOf<String>()
        for (i in 1..10) {
            datas2.add("운동도 해야하는데 가기 귀찮다 ? $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager2 = LinearLayoutManager(this@Lcs0806_Ch11MainRecyclerView1Activity)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.lcs0806ch11RecyclerSample2.layoutManager = layoutManager2

        // 어댑터 붙이기.
        binding.lcs0806ch11RecyclerSample2.adapter = Lcs0806_Ch11MyAdapterSample2(datas)

        val datas3 = mutableListOf<String>()
        for(i in 1..10)
        {
            datas3.add("운동도 해야하는데 가기 귀찮다.... $i")
        }

        //리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager3 = LinearLayoutManager(this@Lcs0806_Ch11MainRecyclerView1Activity)
        layoutManager3.orientation = LinearLayoutManager.VERTICAL
        binding.lcs0806ch11RecyclerSample3.layoutManager = layoutManager3

        // 어댑터 붙이기.
        binding.lcs0806ch11RecyclerSample3.adapter = Lcs0806_Ch11MyAdapterSample3(datas)


    } //onCreate
}