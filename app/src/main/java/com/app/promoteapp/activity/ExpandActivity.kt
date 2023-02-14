package com.app.promoteapp.activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.app.promoteapp.adapter.ScreenAdapter
import com.app.promoteapp.databinding.ActivityExpandBinding
import com.bumptech.glide.Glide
import org.jsoup.Jsoup
import org.jsoup.nodes.Element

class ExpandActivity : AppCompatActivity() {
    val TAG ="ExpandActivityTAG"
    lateinit var binding:ActivityExpandBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExpandBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    private fun setData() {
        val document = Jsoup.parse(intent.getStringExtra("content"))
        val olli = document.select("ol").select("li")
        val nameApp = olli.first()?.text()
        binding.txtTitle.text = nameApp.toString()
        val icon = olli[1].select("a").select("img").attr("src")
        Glide.with(this).load(icon).into(binding.image)
        val linkDownload =olli[2].select("a").attr("href")
        binding.btn.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkDownload)))

        }
        val desc   =olli[3].text()
        binding.txtDesc.text =desc
        val ss = olli[4]
        setListSS(ss)
    }

    var imgs  :ArrayList<String> = arrayListOf()
    private fun setListSS(ss: Element?) {
        imgs.clear()
        Log.d(TAG, "setListSS: "+ss?.select("a")?.size)
        val max = ss?.select("a")?.size
        ss?.forEach {
            val img = it.select("a").select("img").attr("src")
            if (!img.isNullOrEmpty()){
                if (imgs.size==0)
                    imgs.add(img)
                else if (imgs[imgs.size-1]!= img)
                    imgs.add(img)
            }

        }
        binding.recyclerView.adapter = ScreenAdapter(this, imgs)
        imgs.forEach {
            Log.d(TAG, "setListSS: "+it)
        }
    }
}