package com.busanit501.androidlabtest501.miniProject.test0710.nhj0918_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityNhj0918MainBinding


class NhjMainFragmentActivity : AppCompatActivity() {

    lateinit var binding: ActivityNhj0918MainBinding

    //순서1, 프래그먼트 그리기 위한 빈 도화지 역할. 액티비티 만들기
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNhj0918MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_main_fragment)
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
        binding.nhjvierpagerTest1.adapter = NhjFragmentAdapter(this)


        //2번째 뷰페이져 붙이기
        binding.nhjvierpagerTest2.adapter = NhjFragmentAdapter2(this)


    }
}