package com.example.harry_potter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class BooksActivity : AppCompatActivity() {
    lateinit var philosopher:CardView
    lateinit var chamber:CardView
    lateinit var prisoner:CardView
    lateinit var goblet:CardView
    lateinit var order:CardView
    lateinit var halfblood:CardView
    lateinit var deathly:CardView
    lateinit var cursed:CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
        philosopher=findViewById(R.id.philosophers_stone)
        chamber=findViewById(R.id.chamber_of_secrets)
        prisoner=findViewById(R.id.prisoner_of_azkaban)
        goblet=findViewById(R.id.goblet_of_fire)
        order=findViewById(R.id.order_of_phoenix)
        halfblood=findViewById(R.id.half_blood_prince)
        deathly=findViewById(R.id.deathly_hallows)
        cursed=findViewById(R.id.cursed_child)

        philosopher.setOnClickListener {
            val int=Intent(this,PhilosophersStone::class.java)
            startActivity(int)
        }
        chamber.setOnClickListener {
            val int=Intent(this,ChamberOfSecrets::class.java)
            startActivity(int)
        }
        prisoner.setOnClickListener {
            val int=Intent(this,PrisonerOfAz::class.java)
            startActivity(int)
        }
        goblet.setOnClickListener {
            val int=Intent(this,GobletOfFire::class.java)
            startActivity(int)
        }
        order.setOnClickListener {
            val int=Intent(this,OrderOfPhoenix::class.java)
            startActivity(int)
        }
        halfblood.setOnClickListener {
            val int=Intent(this,HalfBloodPrince::class.java)
            startActivity(int)
        }
        deathly.setOnClickListener {
            val int=Intent(this,DeathlyHallows::class.java)
            startActivity(int)
        }
        cursed.setOnClickListener {
            val int=Intent(this,CursedChild::class.java)
            startActivity(int)
        }
    }
}