package com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.FragmentLsj09181Binding

class lsj0918Fragment1 : Fragment() {

    lateinit var binding: FragmentLsj09181Binding
    lateinit var TAG: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = "lsj0918Fragment1"
        Log.d(TAG,"생명주기 onCreate")

        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentLsj09181Binding.inflate(layoutInflater,container,false)

        Log.d(TAG,"생명주기 onCreateView")
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"생명주기 onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"생명주기 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"생명주기 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"생명주기 onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"생명주기 onDestroy")
    }


}