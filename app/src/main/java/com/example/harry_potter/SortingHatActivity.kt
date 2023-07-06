package com.example.harry_potter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SortingHatActivity : AppCompatActivity() {
    lateinit var sort:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorting_hat)
        sort=findViewById(R.id.sortBtn)
        sort.setOnClickListener {
           val int=Intent(Intent.ACTION_VIEW,Uri.parse("https://www.wizardingworld.com/news/discover-your-hogwarts-house-on-wizarding-world"))
            startActivity(int)
        }

    }
}