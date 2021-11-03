package com.example.newsapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.Data.DataNews

fun initViewHeadline(view: View, position: Int) {
    val imgHeadline = view.findViewById<ImageView>(R.id.img_news_headline)
    val tvTitleHeadline = view.findViewById<TextView>(R.id.tv_title_headline)
    val tvDescHeadline = view.findViewById<TextView>(R.id.tv_desc_headline)
    val tvDateHeadline = view.findViewById<TextView>(R.id.tv_date_headline)
    val tvAuthorHeadline = view.findViewById<TextView>(R.id.tv_author_headline)

    imgHeadline.setImageResource(DataNews.photoHeadline[position])
    tvTitleHeadline.text = DataNews.titleHeadline[position]
    tvDescHeadline.text = DataNews.contentHeadline[position]
    tvDateHeadline.text = DataNews.dateHeadline[position]
    tvAuthorHeadline.text = DataNews.authorHeadline[position]
}