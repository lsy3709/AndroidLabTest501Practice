package com.busanit501.androidlabtest501.miniProject.test0710_msy0402.msy0402_mini

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class Ch11PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3  // Number of fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Ch11OneFragment()
            1 -> Ch11TwoFragment()
            2 -> Ch11ThreeFragment()
            else -> throw IllegalArgumentException("Invalid position $position")
        }
    }

    companion object {
        fun setupEdgeToEdge(activity: AppCompatActivity, rootView: View) {
            activity.enableEdgeToEdge()
            ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}
