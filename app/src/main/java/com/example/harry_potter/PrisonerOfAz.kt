package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PrisonerOfAz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prisoner_of_az)
        val myWebView: WebView = findViewById(R.id.prisoner_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Prisoner-Azkaban-Rowling/dp/0439136350")
    }
}