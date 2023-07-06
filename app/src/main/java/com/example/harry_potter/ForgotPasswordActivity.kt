package com.example.harry_potter

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var btnReset:Button
    lateinit var email:EditText
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        btnReset=findViewById(R.id.fpassowrdBtn)
        email=findViewById(R.id.email3)
        auth = FirebaseAuth.getInstance()
        btnReset.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val email: String = email.getText().toString().trim()
                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(
                        application,
                        "Enter your registered email id",
                        Toast.LENGTH_SHORT
                    ).show()
                    return
                }

                auth.sendPasswordResetEmail(email)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Toast.makeText(
                                this@ForgotPasswordActivity,
                                "We have sent you instructions to reset your password!",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            Toast.makeText(
                                this@ForgotPasswordActivity,
                                "Failed to send reset email!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }

                    }
            }
        })


    }
}