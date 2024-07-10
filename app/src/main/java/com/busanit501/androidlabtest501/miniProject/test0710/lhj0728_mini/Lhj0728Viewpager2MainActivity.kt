package com.busanit501.androidlabtest501.miniProject.test0710.lhj0728_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityLhj0728Viewpager2MainBinding

class Lhj0728Viewpager2MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityLhj0728Viewpager2MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLhj0728Viewpager2MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_viewpager2_test_fragment_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 더미 데이터 만들기.
        val testData = mutableListOf<String>()
        for (i in 0..2) {
            testData.add("배고파요 $i")
        }

        // 뷰페이져의 속성에 어댑터 속성 연결하기.
        binding.vierpagerTest1.adapter = Lhj0728ViewpagerFragmentAdapter(this)

    } // onCreate
}