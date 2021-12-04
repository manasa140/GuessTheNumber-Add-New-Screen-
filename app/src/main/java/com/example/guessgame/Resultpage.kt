package com.example.guessgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Resultpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultpage)
        val userName= intent.getIntExtra("nameOfuser",0)
        //val userGuessing = Integer.parseInt(userName);

        findViewById<TextView>(R.id.resultStatement).text=" you won the number is"
        findViewById<TextView>(R.id.ResultValue).text="$userName"
    }
    }
