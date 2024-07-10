package com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.adapter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityLsj0918ViewpagerFragmentMainBinding

class lsj0918ViewpagerFragmentMainActivity : AppCompatActivity() {
    lateinit var binding: ActivityLsj0918ViewpagerFragmentMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLsj0918ViewpagerFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

 //       setContentView(R.layout.activity_laj0918_viewpager_fragment_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //더미 데이터 만들기.
        val testData = mutableListOf<String>()
        for (i in 0..2) {
            testData.add("썸머송 추천? $i")
        }

        // 뷰페이져의 속성에 어댑터 속성 연결하기.
        binding.lsj0918viewpager1.adapter = lsj0918MyViewpagerFragmentAdapter(this)


        //2번째 뷰페이져 붙이기
        binding.lsj0918viewpager2.adapter = lsj0918MyViewpagerFragmentAdapter2(this)
    }
}