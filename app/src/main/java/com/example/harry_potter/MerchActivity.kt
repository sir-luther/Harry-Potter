package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MerchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_merch)
        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://harrypottershop.co.uk/")
    }
}