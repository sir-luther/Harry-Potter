package com.example.harry_potter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var Login: Button
    lateinit var Continue: Button
    lateinit var Sign: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Login=findViewById(R.id.MoveBtn)
        Continue=findViewById(R.id.SkipBtn)
        Sign=findViewById(R.id.SignupBtn)

        Login.setOnClickListener {
            val inten= Intent(this,LoginActivity::class.java)
            startActivity(inten)
        }

        Continue.setOnClickListener {
            val int= Intent(this,DashboardActivity::class.java)
            startActivity(int)
        }
        Sign.setOnClickListener {
            val int= Intent(this,RegisterActivity::class.java)
            startActivity(int)
        }
    }
}