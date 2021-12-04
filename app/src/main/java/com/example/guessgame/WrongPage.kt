package com.example.guessgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WrongPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wrong_page)
        val userName= intent.getIntExtra("wrongUser",0)
        //val userGuessing = Integer.parseInt(userName);

        findViewById<TextView>(R.id.wrongMessage).text=" you lost after 12 Attempts" +
                "\n\t\t  The number is "
        findViewById<TextView>(R.id.wrongvalue).text="$userName"
    }
}