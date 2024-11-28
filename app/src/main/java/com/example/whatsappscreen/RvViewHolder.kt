package com.example.whatsappscreen

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvViewHolder(itemview:View):RecyclerView.ViewHolder(itemview)
{
    var image=itemview.findViewById<ImageView>(R.id.name1_image)
    var name=itemview.findViewById<TextView>(R.id.name)
    var msg=itemview.findViewById<TextView>(R.id.message1)
    var time=itemview.findViewById<TextView>(R.id.time1)
}