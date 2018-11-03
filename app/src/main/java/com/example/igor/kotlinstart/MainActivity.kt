package com.example.igor.kotlinstart

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val anim = AnimationUtils.loadAnimation(this, R.anim.buttonanim)
        view.startAnimation(anim)
        val edtext: EditText = findViewById(R.id.edtext)

        if (edtext.getText().toString() != "") {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("Name", edtext.getText().toString())
            startActivity(intent)
            finish()
        }
    }
}
