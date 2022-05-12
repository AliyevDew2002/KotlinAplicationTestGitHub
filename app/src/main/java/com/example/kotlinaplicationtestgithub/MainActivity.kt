package com.example.kotlinaplicationtestgithub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open_layer()
    }

    fun open_layer(){
        var b_layer_open=findViewById<Button>(R.id.b_layer_open)
        b_layer_open.setOnClickListener {
            activityLayer()
        }
    }

    fun activityLayer(){
        val intent=Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

}