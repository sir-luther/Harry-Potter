package com.example.harry_potter

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    lateinit var join:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        join=findViewById(R.id.joinBtn)
        join.setOnClickListener {
            val inter=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.wizardingworld.com/harry-potter-fan-club"))
            startActivity(inter)
        }
    }
}