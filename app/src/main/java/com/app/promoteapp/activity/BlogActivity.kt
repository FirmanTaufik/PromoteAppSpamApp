package com.app.promoteapp.activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
import com.app.promoteapp.adapter.BlogAdapter
import com.app.promoteapp.R
import com.app.promoteapp.models.Detail


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


class BlogActivity : AppCompatActivity() {
    private val TAG = "BlogActivityTAG"
    lateinit var swipeRefreshLayout: SwipeRefreshLayout
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)
        recyclerView = findViewById(R.id.recyclerView)
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout)
        swipeRefreshLayout.setRefreshing(true)
        swipeRefreshLayout.setOnRefreshListener(OnRefreshListener { data })
        data
    }

    private val data: Unit
        private get() {
            recyclerView!!.layoutManager = LinearLayoutManager(this)
            val getService = retrofitInstance.create(GetService::class.java)
            getService.allPost.enqueue(object : Callback<Detail> {
                override fun onResponse(call: Call<Detail>, response: Response<Detail>) {
                    swipeRefreshLayout!!.isRefreshing = false
                    Log.d(TAG, "onResponse: "+response.body()?.feed?.entry?.size)
                    try {

                        recyclerView!!.adapter =
                            BlogAdapter(
                                this@BlogActivity,
                                response.body()?.feed?.entry
                            )
                    }catch (n :NullPointerException) {
                        Log.d(TAG, "onResponse: "+n.message)
                    }
                }

                override fun onFailure(call: Call<Detail>, t: Throwable) {
                    swipeRefreshLayout!!.isRefreshing = false
                    Log.d(TAG, "onFailure: ")
                }
            })
        }

    override fun onBackPressed() {}
    private val retrofitInstance: Retrofit
        private get() = Retrofit.Builder()
            .baseUrl("https://promoteappv1.blogspot.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    interface GetService {
        @get:GET("/feeds/posts/default?alt=json&&max-results=1000")
        val allPost: Call<Detail>
    }
}