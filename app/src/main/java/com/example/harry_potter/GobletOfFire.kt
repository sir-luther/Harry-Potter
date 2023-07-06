package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class GobletOfFire : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goblet_of_fire)
        val myWebView: WebView = findViewById(R.id.goblet_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Goblet-Fire-Rowling/dp/0439139600")
    }
}