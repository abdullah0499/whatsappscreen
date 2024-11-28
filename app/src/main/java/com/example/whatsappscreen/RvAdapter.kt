package com.example.whatsappscreen

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(var userlist:List<User>):RecyclerView.Adapter<RvViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return RvViewHolder(view)
    }
    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        val item=userlist[position]
        holder.image.setImageResource(item.image)
        holder.name.text=item.name
        holder.msg.text=item.msg
        holder.time.text=item.time.toString()

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,"${item.name} clicked!",Toast.LENGTH_SHORT).show()
        }

    }
}