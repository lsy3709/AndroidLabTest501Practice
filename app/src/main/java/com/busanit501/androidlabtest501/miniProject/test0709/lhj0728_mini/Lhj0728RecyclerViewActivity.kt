package com.busanit501.androidlabtest501.miniProject.test0709.lhj0728_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityLhj0728RecyclerViewBinding

class Lhj0728RecyclerViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityLhj0728RecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lhj0728_recycler_view)
        binding = ActivityLhj0728RecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 샘플 더미 데이터 넣기.
        val datas = mutableListOf<String>()
        for(i in 1..5) {
            datas.add("배고파요 $i")
        }

        // 리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager = LinearLayoutManager(this@Lhj0728RecyclerViewActivity)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.RecyclerSample1.layoutManager = layoutManager

        // 어댑터 붙이기.
        binding.RecyclerSample1.adapter = Lhj0728Adapter(datas)

        // 2번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        // 샘플 더미 데이터 넣기.2
        val datas2 = mutableListOf<String>()
        for(i in 1..5) {
            datas2.add("밥 먹게 해주세요 $i")
        }

        // 리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager2 = LinearLayoutManager(this@Lhj0728RecyclerViewActivity)
        layoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.RecyclerSample2.layoutManager = layoutManager2

        // 어댑터 붙이기.
        binding.RecyclerSample2.adapter = Lhj0728Adapter2(datas2)

        // 3번째 리사이클러뷰 붙이기 작업, 더미 데이터 추가.
        // 샘플 더미 데이터 넣기.3
        val datas3 = mutableListOf<String>()
        for(i in 1..5) {
            datas3.add("꼬르륵 $i")
        }

        // 리사이클러뷰 , 어떤 모양으로 배치할지 정하기.
        // 세로 방향, 가로 방향, 지그재그, 그리드 등.
        val layoutManager3 = LinearLayoutManager(this@Lhj0728RecyclerViewActivity)
        layoutManager3.orientation = LinearLayoutManager.VERTICAL
        binding.RecyclerSample3.layoutManager = layoutManager3

        // 어댑터 붙이기.
        binding.RecyclerSample3.adapter = Lhj0728Adapter3(datas3)

    }
}