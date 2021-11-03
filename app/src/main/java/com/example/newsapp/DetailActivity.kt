package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA_TITLE = "title"
        const val EXTRA_DATA_DATE = "date"
        const val EXTRA_DATA_AUTHOR = "author"
        const val EXTRA_DATA_IMAGE = "image"
        const val EXTRA_DATA_CONTENT = "content"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val dataTitle = intent.getStringExtra(EXTRA_DATA_TITLE)
        val dataDate = intent.getStringExtra(EXTRA_DATA_DATE)
        val dataAuthor = intent.getStringExtra(EXTRA_DATA_AUTHOR)
        val dataContent = intent.getStringExtra(EXTRA_DATA_CONTENT)
        val dataImage = intent.getIntExtra(EXTRA_DATA_IMAGE, 0)

        findViewById<TextView>(R.id.tv_title_detail).text = dataTitle
        findViewById<TextView>(R.id.tv_date_detail).text = dataDate
        findViewById<TextView>(R.id.tv_author_detail).text = dataAuthor
        findViewById<TextView>(R.id.tv_content_detail).text = dataContent
        findViewById<ImageView>(R.id.img_news_detail).setImageResource(dataImage)
    }
}