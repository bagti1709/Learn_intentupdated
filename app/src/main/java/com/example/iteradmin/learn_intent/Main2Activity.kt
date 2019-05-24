package com.example.iteradmin.learn_intent

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button=findViewById<Button>(R.id.button)
        val text=findViewById<TextView>(R.id.textView)

            val i=intent
            text.setText(i.getStringExtra("name"))

            button.setOnClickListener{
                val s:String=text.text.toString()
            val i=Intent(Intent.ACTION_CALL)
            i.setData(Uri.parse("tel:"+s))
            startActivity(i)
            }
        }
    }

