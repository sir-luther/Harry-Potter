package com.example.harry_potter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DashboardActivity : AppCompatActivity() {
    lateinit var buch:ImageView
    lateinit var merchandise:ImageView
    lateinit var sorting:ImageView
    lateinit var aboutus:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        buch=findViewById(R.id.books)
        merchandise=findViewById(R.id.merch)
        sorting=findViewById(R.id.sort)
        aboutus=findViewById(R.id.about)

        buch.setOnClickListener {
            val inter=Intent(this,BooksActivity::class.java)
            startActivity(inter)
        }

        merchandise.setOnClickListener {
            val inter=Intent(this,MerchActivity::class.java)
            startActivity(inter)
        }

        sorting.setOnClickListener {
            val inter=Intent(this,SortingHatActivity::class.java)
            startActivity(inter)
        }
        aboutus.setOnClickListener {
            val inter=Intent(this,AboutActivity::class.java)
            startActivity(inter)
        }
    }
}