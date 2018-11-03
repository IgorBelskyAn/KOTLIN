package com.example.igor.kotlinstart

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val txv: TextView = findViewById(R.id.text)
        val inten = getIntent()

        txv.setText("Привет " + inten.getStringExtra("Name")+"!")
    }

    fun click(view: View) {

        val anim = loadAnimation(this, R.anim.buttonanim)
        view.startAnimation(anim)
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
