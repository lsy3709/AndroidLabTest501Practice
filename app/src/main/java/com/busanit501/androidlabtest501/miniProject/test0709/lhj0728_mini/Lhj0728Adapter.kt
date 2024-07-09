package com.busanit501.androidlabtest501.miniProject.test0709.lhj0728_mini

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busanit501.androidlabtest501.databinding.Ch11ItemSimpleRecyclerBinding
import com.busanit501.androidlabtest501.databinding.Lhj0728ItemRecyclerBinding

class Lhj0728Adapter(val datas: MutableList<String> ) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    // 어댑터에 뷰홀더 연결하기.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder  =
        Lhj0728ViewHolder(Lhj0728ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent, false))

    // 목록 요소의 갯수, 화면에 출력이 되는 갯수
    override fun getItemCount(): Int {
        return datas.size
    }

    // 해당 연결 된 뷰에, 데이터 넣기.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as Lhj0728ViewHolder).binding
        binding.Recycler1ItemTextView.text = datas[position]
    }
}