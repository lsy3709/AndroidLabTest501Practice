package com.busanit501.androidlabtest501.miniProject.test0710.msy0402_mini

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R

class Ch11OneFragment_msy0402 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.activity_fragment_ch11_one_msy0402, container, false)

        // Enable edge-to-edge display
        activity?.let {
            if (it is AppCompatActivity) {
                it.enableEdgeToEdge()
            }
            ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        return rootView
    }
}
