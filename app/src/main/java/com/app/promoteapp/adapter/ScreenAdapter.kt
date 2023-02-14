package com.app.promoteapp.adapter

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.app.promoteapp.R
import com.bumptech.glide.Glide
import android.view.View
import android.widget.ImageView
import com.app.promoteapp.activity.ExpandActivity
import com.app.promoteapp.activity.FullscreenActivity

class ScreenAdapter(private val context: Context, private val entries: ArrayList<String>) :
    RecyclerView.Adapter<ScreenAdapter.ViewHolder>() {
    val TAG ="ScreenAdapterTAG"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_ss, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder: "+entries)
        Glide.with(context).load(entries[position] ).into(holder.image)
        holder.itemView.setOnClickListener {
            val intent = Intent(context, FullscreenActivity::class.java)
            intent.putExtra("img", entries[position])
            context.startActivity(intent)
        }

    }



    override fun getItemCount(): Int {
        return entries.size  
    }



    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView

        init {
            image = itemView.findViewById(R.id.image)
        }
    }
}