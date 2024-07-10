package com.busanit501.androidlabtest501.ch11_jetpack.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.databinding.FragmentLhj0728ThirdBinding

class Lhj0728ThirdFragment : Fragment() {

    lateinit var binding: FragmentLhj0728ThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLhj0728ThirdBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

}