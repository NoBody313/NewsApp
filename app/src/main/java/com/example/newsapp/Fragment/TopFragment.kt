package com.example.newsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.Data.DataNews
import com.example.newsapp.Adapter.NewsAdapter
import com.example.newsapp.R
import com.example.newsapp.initViewHeadline


class TopFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_top, container, false)

        val rvNews = view.findViewById<RecyclerView>(R.id.rv_top_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listTopNews)

        val imgHeadline: ImageView = view.findViewById(R.id.img_news_headline)
        val tvTableHeadline: TextView = view.findViewById(R.id.tv_title_headline)
        val tvDescHeadline: TextView = view.findViewById(R.id.tv_desc_headline)
        val tvDateHeadline: TextView = view.findViewById(R.id.tv_date_headline)
        val tvAuthorHeadline: TextView = view.findViewById(R.id.tv_author_headline)

        imgHeadline.setImageResource(DataNews.photoHeadline[2])
        tvTableHeadline.text = DataNews.titleHeadline[2]
        tvDescHeadline.text = DataNews.contentHeadline[2]
        tvDateHeadline.text = DataNews.dateHeadline[2]
        tvAuthorHeadline.text = DataNews.authorHeadline[2]

        initViewHeadline(view, 2)

        return view
    }
}