package com.busanit501.androidlabtest501.ch11_jetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.databinding.FragmentLhs0418Ch11ThreeBinding

class Ch11Lhs0418ThreeFragment : Fragment() {


    // 순서2, 프래그먼트 만들기. 뼈대 샘플 코딩 많이 지움.

    lateinit var binding: FragmentLhs0418Ch11ThreeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLhs0418Ch11ThreeBinding.inflate(layoutInflater,container,false)

//        return inflater.inflate(R.layout.fragment_ch11_one, container, false)
        return binding.root
    }


}