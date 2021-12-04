package com.example.guessgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeButton = findViewById<TextView>(R.id.AmIRight)
        val result = findViewById<TextView>(R.id.solution)
        var number: Int = 650
        var count = 0

        clickMeButton.setOnClickListener {
            //while (count <= 12) {
                val userNameTextInputView = findViewById<TextInputLayout>(R.id.GuessWord)
                val userName = userNameTextInputView.editText?.text?.toString()
                val userGuessing = Integer.parseInt(userName);
                val finalvalue =
                    if (userGuessing > number) "No;) My Number is Smaller"
                    else if (userGuessing < number) "No;) My Number is Greater "
                    else " "
                if (finalvalue == " ") {

                    val newScreenIntent = Intent(this, Resultpage::class.java)
                    newScreenIntent.putExtra("nameOfuser", number)
                    startActivity(newScreenIntent)
                }

                result.text = "$finalvalue"
               count++
           // }
            if(count>12)
            {
                val newScreenIntent1 = Intent(this, WrongPage::class.java)
                newScreenIntent1.putExtra("wrongUser", number)
                startActivity(newScreenIntent1)
            }


        }
    }
}