package com.app.promoteapp.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.app.promoteapp.R
import com.bumptech.glide.Glide
import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.app.promoteapp.activity.ExpandActivity
import org.jsoup.Jsoup
import android.widget.TextView
import com.app.promoteapp.models.Entry

class BlogAdapter(private val context: Context, private val entries: List<Entry>?) :
    RecyclerView.Adapter<BlogAdapter.ViewHolder>() {
    val TAG ="BlogAdapterTAG"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_blog, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtTitle.text = entries!![position].title.`$t`
        holder.txtDesc.text = getDesc(entries[position].content.`$t`)
        Glide.with(context).load(fetchGambar(entries[position].content.`$t`)).into(holder.image)
        holder.btn.setOnClickListener {
            val intent = Intent(context, ExpandActivity::class.java)
            intent.putExtra("title", entries[position].title.`$t`)
            intent.putExtra("content", entries[position].content.`$t`)
            context.startActivity(intent)
        }
    }

    private fun getDesc(`$t`: String): String {
        val document = Jsoup.parse(`$t`)
        if (document.select("img").size != 0) {
            document.select("img").remove()
        }
        Log.d(TAG, "getDesc: "+`$t`)

        val ulli = document.select("ol").select("li")

        return ulli[3].text()
    }

    override fun getItemCount(): Int {
        return entries?.size ?: 0
    }

    private fun fetchGambar(content: String): String {
        val document = Jsoup.parse(content)
        return if (document.select("img").size != 0) {
            document.select("img").attr("src")
        } else "http://anekapaperaindah.id/img/No_image_available.jpg"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle: TextView
        val txtDesc // init the item view's
                : TextView
        val image: ImageView
        val btn:Button

        init {
            btn = itemView.findViewById<View>(R.id.btn) as Button
            txtDesc = itemView.findViewById<View>(R.id.txtDesc) as TextView
            txtTitle = itemView.findViewById<View>(R.id.txtTitle) as TextView
            image = itemView.findViewById(R.id.image)
        }
    }
}