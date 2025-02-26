package com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.fragment.lsj0918Fragment1
import com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.fragment.lsj0918Fragment2
import com.busanit501.androidlabtest501.miniProject.test0710.lsj0918_mini.fragment.lsj0918Fragment3

class lsj0918MyViewpagerFragmentAdapter2 (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // 프래그먼트를 요소로 가지는 리스트 정의
    var sampleFragmentList : List<Fragment>


    init {
        // 샘플 프래그먼트 재사용.
        //Ch11OneFragment, Ch11TwoFragment, Ch11ThreeFragment

        sampleFragmentList = mutableListOf(lsj0918Fragment1(), lsj0918Fragment2(), lsj0918Fragment3())

    }

    // 출력할 목록 요소의 갯수
    override fun getItemCount(): Int = sampleFragmentList.size

    // 프래그먼트 를 연결하기
    override fun createFragment(position: Int): Fragment {
        val returnFragment : Fragment = sampleFragmentList[position]
        return  returnFragment
    }

}