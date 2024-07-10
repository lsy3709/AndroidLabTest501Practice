package com.busanit501.androidlabtest501.miniProject.test0710.ohj_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityOhjCh11Viewpager2TestFragmentMainBinding

class ohj_Ch11Viewpager2TestFragmentMainActivity : AppCompatActivity() {
    lateinit var binding : ActivityOhjCh11Viewpager2TestFragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOhjCh11Viewpager2TestFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_viewpager2_test_fragment_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //더미 데이터 만들기.
        val testData = mutableListOf<String>()
        for (i in 0..2) {
            testData.add("오늘 점심은 뭐 먹나요? $i")
        }

        // 뷰페이져의 속성에 어댑터 속성 연결하기.
        binding.ch11vierpagerTest1.adapter = ohj_MyViewpagerFragmentAdapter(this)


        //2번째 뷰페이져 붙이기
        binding.ch11vierpagerTest2.adapter = ohj_MyViewpagerFragmentAdapter2(this)

    } //onCreate
}