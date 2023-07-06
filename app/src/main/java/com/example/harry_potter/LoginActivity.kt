package com.example.harry_potter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var login:Button
    lateinit var forgot:TextView
    lateinit var sign:TextView
    lateinit var myemail1: EditText
    lateinit var mypassword1: EditText
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        sign=findViewById(R.id.text2)
        forgot=findViewById(R.id.fpassword)
        login=findViewById(R.id.loginBtn)
        myemail1 = findViewById(R.id.email1)
        mypassword1 = findViewById(R.id.password1)
        auth=FirebaseAuth.getInstance()


        sign.setOnClickListener {
            val int= Intent(this,RegisterActivity::class.java)
            startActivity(int)
            finish()
        }
        login.setOnClickListener {
            login()
        }
        forgot.setOnClickListener {
            val int=Intent(this,ForgotPasswordActivity::class.java)
            startActivity(int)
        }
    }
    private fun login(){
        val email=myemail1.text.toString()
        val pass=mypassword1.text.toString()
        if (email.isBlank() || pass.isBlank()){
            Toast.makeText(this,"Email or password cannot be blank",Toast.LENGTH_LONG).show()
            return
        }else if (pass.isBlank()){
            Toast.makeText(this,"Password incorrect or blank",Toast.LENGTH_LONG).show()
            return
        }
        
        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"Successfully logged in", Toast.LENGTH_LONG).show()
                val int=Intent(this,MainActivity::class.java)
                startActivity(int)

            } else{
                Toast.makeText(this,"Failed to log in", Toast.LENGTH_LONG).show()

            }
        }
    }
}