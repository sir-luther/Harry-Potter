package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CursedChild : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cursed_child)
        val myWebView: WebView = findViewById(R.id.cursed_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Cursed-Child-Parts/dp/133821666X")
    }
}