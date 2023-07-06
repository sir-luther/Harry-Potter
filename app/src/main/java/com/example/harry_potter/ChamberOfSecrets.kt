package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ChamberOfSecrets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chamber_of_secrets)
        val myWebView: WebView = findViewById(R.id.chamber_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Chamber-Secrets-Rowling/dp/0439064872")
    }
}