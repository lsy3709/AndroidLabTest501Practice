package com.busanit501.androidlabtest501.miniProject.test0710.msy0402_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.busanit501.androidlabtest501.databinding.ActivityCh11MainFragmentBinding

class Ch11MainFragmentActivity_msy0402 : AppCompatActivity() {

    private lateinit var binding: ActivityCh11MainFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCh11MainFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()

        // Apply window insets listener to the main layout
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Setup ViewPager2 with adapter
        val viewPager: ViewPager2 = binding.viewPager
        val adapter = Ch11PagerAdapter_msy0402(this)
        viewPager.adapter = adapter
    }
}
