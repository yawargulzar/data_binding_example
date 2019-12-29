package com.f.data_binding_example

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.f.data_binding_example.databinding.ItemUserBinding

class MainAdapter(private val userList: List<User>,private val listener :View.OnClickListener) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
       val binding : ItemUserBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.item_user,parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindTo(userList[position],listener)

    }


    class MyViewHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindTo(user: User, listener: View.OnClickListener) {
            binding.userModel = user
            binding.listener = listener

        }
    }
}