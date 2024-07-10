package com.busanit501.androidlabtest501.miniProject.test0710.kdk1115_mini.viewpage2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.busanit501.androidlabtest501.miniProject.test0710.kdk1115_mini.fragments.KdkCh11Fragment1
import com.busanit501.androidlabtest501.miniProject.test0710.kdk1115_mini.fragments.KdkCh11Fragment2
import com.busanit501.androidlabtest501.miniProject.test0710.kdk1115_mini.fragments.KdkCh11Fragment3


class MyViewpagerFragmentAdapter2(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // 프래그먼트를 요소로 가지는 리스트 정의
    var sampleFragmentList : List<Fragment>

    init {
        // 샘플 프래그먼트 재사용..
        //Ch11OneFragment, Ch11TwoFragment, Ch11ThreeFragment

        sampleFragmentList = mutableListOf(KdkCh11Fragment1(), KdkCh11Fragment2(), KdkCh11Fragment3())

    }

    // 출력할 목록 요소의 갯수
    override fun getItemCount(): Int = sampleFragmentList.size

    // 프래그먼트 를 연결하기
    override fun createFragment(position: Int): Fragment {
        val returnFragment : Fragment = sampleFragmentList[position]
        return  returnFragment
    }

}