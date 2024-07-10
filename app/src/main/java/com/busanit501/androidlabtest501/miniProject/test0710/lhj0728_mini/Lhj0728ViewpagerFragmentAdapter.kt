package com.busanit501.androidlabtest501.miniProject.test0710.lhj0728_mini

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.busanit501.androidlabtest501.ch11_jetpack.fragments.Lhj0728FirstFragment
import com.busanit501.androidlabtest501.ch11_jetpack.fragments.Lhj0728ThirdFragment
import com.busanit501.androidlabtest501.ch11_jetpack.fragments.Lhj0728SecondFragment


class Lhj0728ViewpagerFragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    // 프래그먼트를 요소로 가지는 리스트 정의
    var sampleFragmentList : List<Fragment>

    init {
        // 샘플 프래그먼트 재사용.
        sampleFragmentList = mutableListOf(Lhj0728FirstFragment(), Lhj0728SecondFragment(), Lhj0728ThirdFragment())
    }

    // 출력할 목록 요소의 갯수
    override fun getItemCount(): Int = sampleFragmentList.size

    // 프래그먼트 를 연결하기
    override fun createFragment(position: Int): Fragment {
        val returnFragment : Fragment = sampleFragmentList[position]
        return  returnFragment
    }

}