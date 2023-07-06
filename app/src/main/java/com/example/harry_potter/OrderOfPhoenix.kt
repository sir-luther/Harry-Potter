package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class OrderOfPhoenix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_of_phoenix)
        val myWebView: WebView = findViewById(R.id.order_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Order-Phoenix-Book/dp/043935806X")
    }
}