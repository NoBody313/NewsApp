package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.newsapp.Data.News

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NEWS_DATA = "news"
        const val EXTRA_DATA_TITLE = "title"
        const val EXTRA_DATA_DATE = "date"
        const val EXTRA_DATA_AUTHOR = "author"
        const val EXTRA_DATA_IMAGE = "image"
        const val EXTRA_DATA_CONTENT = "content"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(findViewById(R.id.toolbar_detail))
        supportActionBar?.apply {
            // Izinkan Arrow Back Di ToolBar
            setDisplayShowHomeEnabled(true)
            title = "News Detail"
        }

        val dataTitle = intent.getStringExtra(EXTRA_DATA_TITLE)
        val dataDate = intent.getStringExtra(EXTRA_DATA_DATE)
        val dataAuthor = intent.getStringExtra(EXTRA_DATA_AUTHOR)
        val dataContent = intent.getStringExtra(EXTRA_DATA_CONTENT)
        val dataImage = intent.getIntExtra(EXTRA_DATA_IMAGE, 0)

        val news = intent.getParcelableExtra<News>(EXTRA_NEWS_DATA)

        val tvTitle = findViewById<TextView>(R.id.tv_title_detail)
        tvTitle.text = dataTitle
        val tvDetail = findViewById<TextView>(R.id.tv_date_detail)
        tvDetail.text = dataDate
        val tvAuthor = findViewById<TextView>(R.id.tv_author_detail)
        tvAuthor.text = dataAuthor
        val tvContent = findViewById<TextView>(R.id.tv_content_detail)
        tvContent.text = dataContent
        val imgDetail = findViewById<ImageView>(R.id.img_news_detail)
        imgDetail.setImageResource(dataImage)

        if (news != null) {
            tvTitle.text = news.title
            tvDetail.text = news.date
            tvAuthor.text = news.author
            tvContent.text = news.content
            news.let { imgDetail.setImageResource(it.image) }
        } else {
            tvTitle.text = dataTitle
            tvDetail.text = dataDate
            tvAuthor.text = dataAuthor
            tvContent.text = dataContent
            imgDetail.setImageResource(dataImage)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}