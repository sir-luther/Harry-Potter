package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class DeathlyHallows : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deathly_hallows)
        val myWebView: WebView = findViewById(R.id.deathly_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Deathly-Hallows-Book/dp/0545139708")
    }
}