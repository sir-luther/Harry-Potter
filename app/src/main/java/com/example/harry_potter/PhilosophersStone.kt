package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PhilosophersStone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_philosophers_stone)
        val myWebView: WebView = findViewById(R.id.philosopher_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Philosophers-Stone-Rowling/dp/0747532745")
    }
}