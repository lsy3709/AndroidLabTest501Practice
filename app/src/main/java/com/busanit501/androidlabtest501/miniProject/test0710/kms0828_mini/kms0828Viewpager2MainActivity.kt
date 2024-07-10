package com.busanit501.androidlabtest501.miniProject.test0710.kms0828_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityKms0828Viewpager2MainBinding

class kms0828Viewpager2MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityKms0828Viewpager2MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityKms0828Viewpager2MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_viewpager2_test_fragment_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val testData = mutableListOf<String>()
        for (i in 0..2) {
            testData.add("오늘은? $i")
        }

        // 뷰페이져의 속성에 어댑터 속성 연결하기.
        binding.ch11viewpagerTest1.adapter = kms0828MyViewpagerFragmentAdapter(this)


        //2번째 뷰페이져 붙이기
        binding.ch11viewpagerTest2.adapter = kms0828MyViewpagerFragmentAdapter2(this)

        //3번
        binding.ch11viewpagerTest3.adapter = kms0828MyViewpagerFragmentAdapter3(this)

    }
}