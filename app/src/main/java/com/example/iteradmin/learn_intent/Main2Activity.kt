package com.example.iteradmin.learn_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button=findViewById<Button>(R.id.button)
        val text=findViewById<TextView>(R.id.textView)

            val i=intent
            text.setText(i.getStringExtra("name"))

            button.setOnClickListener{
                finish()
            }
        }
    }

