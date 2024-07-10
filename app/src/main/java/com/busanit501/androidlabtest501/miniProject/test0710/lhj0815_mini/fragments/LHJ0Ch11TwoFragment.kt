package com.busanit501.androidlabtest501.miniProject.test0710.lhj0815_mini.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.FragmentCh11TwoLhj0815Binding

class LHJ0Ch11TwoFragment : Fragment() {


    // 순서2, 프래그먼트 만들기. 뼈대 샘플 코딩 많이 지움.

    lateinit var binding: FragmentCh11TwoLhj0815Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCh11TwoLhj0815Binding.inflate(layoutInflater,container,false)

//        return inflater.inflate(R.layout.fragment_ch11_one, container, false)
        return binding.root
    }


}