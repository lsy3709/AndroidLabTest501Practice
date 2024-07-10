package com.busanit501.androidlabtest501.ch11_jetpack.viewpage2.adapter

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.Lcs0806activityCh11Viewpager2TestFragmentMainBinding

class Lcs0806Ch11Viewpager2TestFragmentMainActivity : AppCompatActivity() {
    lateinit var binding : Lcs0806activityCh11Viewpager2TestFragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = Lcs0806activityCh11Viewpager2TestFragmentMainBinding.inflate(layoutInflater)
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
            testData.add("비오니깐 파전 땡기네요? $i")
        }

        //1번째 뷰페이져 붙이기
        binding.ch11vierpagerTest2.adapter = Lcs0806MyViewpagerFragmentAdapter(this)

    } //onCreate
}