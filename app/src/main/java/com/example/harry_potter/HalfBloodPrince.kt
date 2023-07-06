package com.example.harry_potter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class HalfBloodPrince : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_half_blood_prince)
        val myWebView: WebView = findViewById(R.id.halfblood_web)
        myWebView.loadUrl("https://www.amazon.com/Harry-Potter-Half-Blood-Prince-Book/dp/0439784549")
    }
}