package com.example.harry_potter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var mycpassword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        myemail=findViewById(R.id.email2)
        mypassword=findViewById(R.id.password2)
        mycpassword=findViewById(R.id.cpassword)
        signup=findViewById(R.id.signupBtn)
        mylogin=findViewById(R.id.text3)
        auth=FirebaseAuth.getInstance()

        mylogin.setOnClickListener {
            val inte= Intent(this,LoginActivity::class.java)
            startActivity(inte)
            finish()
        }
        signup.setOnClickListener {
            SignUpUser()
        }
    }
    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=mycpassword.text.toString()
        if(email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Please fill in all available fields", Toast.LENGTH_LONG).show()
            return
        }   else if (pass != confirmpass){
            Toast.makeText(this,"Passwords do not match", Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this,"Signed up successfully", Toast.LENGTH_LONG).show()
                val intent=Intent(this,LoginActivity::class.java)
                startActivity(intent)

            } else{
                Toast.makeText(this,"Failed to sign up", Toast.LENGTH_LONG).show()

            }
        }
    }

}