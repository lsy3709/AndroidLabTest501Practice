package com.busanit501.androidlabtest501.ch11_jetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.FragmentLhj0728SecondBinding

class Lhj0728SecondFragment : Fragment() {

    // 순서2, 프래그먼트 만들기. 뼈대 샘플 코딩 많이 지움.

    lateinit var binding: FragmentLhj0728SecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLhj0728SecondBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}