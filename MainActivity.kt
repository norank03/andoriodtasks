package com.example.myapplication3


import android.graphics.Color
import android.os.Bundle
import android.widget.Button

import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val lay = findViewById<ConstraintLayout>(R.id.clctext)


        val ta1 = findViewById<TextView>(R.id.t3)
        val ta2 = findViewById<TextView>(R.id.t4)
        val ta4 = findViewById<TextView>(R.id.t5)
        val ta5 = findViewById<TextView>(R.id.t6)
        val ta6 = findViewById<TextView>(R.id.t7)
        val ta7 = findViewById<TextView>(R.id.t8)
        val ta8 = findViewById<TextView>(R.id.t9)
        val b10 =findViewById<Button>(R.id.button3)
        val b9 =findViewById<Button>(R.id.button2)
        val b11 =findViewById<Button>(R.id.button)
        lay.setOnClickListener {
            lay.setBackgroundColor(Color.GRAY)


            ta1.text = getString(R.string.box3)
            ta2.text = getString(R.string.box2)
            ta4.text = getString(R.string.box5)

            ta5.text = getString(R.string.box5)
            ta6.text = getString(R.string.box6)
            ta7.text = getString(R.string.box88)
            ta8.text = getString(R.string.box33)


        }

        b10.setOnClickListener{
            ta4.setBackgroundColor(Color.GREEN)


        }

        b9.setOnClickListener{
            ta6.setBackgroundColor(Color.YELLOW)


        }
        b11.setOnClickListener{
            ta5.setBackgroundColor(Color.RED)


        }
        ta5.setOnClickListener{
            ta5.setBackgroundColor(Color.YELLOW)


        }
        ta6.setOnClickListener{
            ta6.setBackgroundColor(Color.BLUE)


        }
        ta7.setOnClickListener{
            ta7.setBackgroundColor(Color.LTGRAY)


        }
        ta8.setOnClickListener{
            ta8.setBackgroundColor(Color.RED)


        }






    }
}
