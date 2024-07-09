package com.busanit501.androidlabtest501.miniProject.test0709.lhj0728_mini

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busanit501.androidlabtest501.databinding.Ch11ItemSimpleRecycler2Binding
import com.busanit501.androidlabtest501.databinding.Lhj0728ItemRecycler2Binding
import com.busanit501.androidlabtest501.databinding.Lhj0728ItemRecycler3Binding

class Lhj0728Adapter3(val datas: MutableList<String> ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder  =
        Lhj0728ViewHolder3(Lhj0728ItemRecycler3Binding.inflate(LayoutInflater.from(parent.context),parent, false))

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as Lhj0728ViewHolder3).binding
        binding.Recycler3ItemTextView.text = datas[position]
        binding.lhj0728ItemRoot3.setOnClickListener {
            Log.d("lhj", "목록 요소가 클릭됨 : $position")
        }
    }
}