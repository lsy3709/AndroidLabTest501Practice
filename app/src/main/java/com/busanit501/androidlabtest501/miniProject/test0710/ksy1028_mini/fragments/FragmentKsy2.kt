package com.busanit501.androidlabtest501.miniProject.test0710.ksy1028_mini.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.busanit501.androidlabtest501.databinding.FragmentKsy1Binding
import com.busanit501.androidlabtest501.databinding.FragmentKsy2Binding


class FragmentKsy2 : Fragment() {

    lateinit var bindind: FragmentKsy2Binding
    lateinit var TAG: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG = "FragmentKsy2"
        Log.d(TAG,"생명주기 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindind = FragmentKsy2Binding.inflate(layoutInflater, container, false)

        Log.d(TAG,"생명주기 onCreateView")
//        return inflater.inflate(R.layout.fragment_ksy1, container, false)
        return bindind.root
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