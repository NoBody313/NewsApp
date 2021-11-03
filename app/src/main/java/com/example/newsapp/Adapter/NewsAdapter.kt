package com.example.newsapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.Data.News
import com.example.newsapp.R

class NewsAdapter(private val  listNews: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvDate: TextView = view.findViewById(R.id.tv_date)
        val tvCategory: TextView = view.findViewById(R.id.tv_category)
        val tvTime: TextView = view.findViewById(R.id.tv_time)
        val imgNews: ImageView = view.findViewById(R.id.img_news)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_news, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            tvTitle.text = listNews[position].title
            tvCategory.text = listNews[position].category
            tvDate.text = listNews[position].date
            tvTime.text = listNews[position].time
            imgNews.setImageResource(listNews[position].image)
        }
    }

    override fun getItemCount() = listNews.size
}