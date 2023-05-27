package edu.mx.unipolidgo.unit1t2

import android.graphics.Color.parseColor
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonRed).setOnClickListener {
            colorRed(it)
        }
        findViewById<Button>(R.id.buttonYellow).setOnClickListener {
            colorYellow(it)
        }
        findViewById<Button>(R.id.buttonGreen).setOnClickListener {
            colorGreen(it)
        }
        findViewById<TextView>(R.id.boxOne).setOnClickListener {
            colorReturn(it ,1)
        }
        findViewById<TextView>(R.id.boxTwo).setOnClickListener {
            colorReturn(it ,2)
        }
        findViewById<TextView>(R.id.boxThree).setOnClickListener {
            colorReturn(it ,3)
        }
        findViewById<TextView>(R.id.boxFour).setOnClickListener {
            colorReturn(it ,4)
        }
        findViewById<TextView>(R.id.boxFive).setOnClickListener {
            colorReturn(it ,5)
        }
    }
    private fun colorRed(view: View){
        val box3 = findViewById<TextView>(R.id.boxThree)
        box3.setBackgroundColor(parseColor("#E95555"))
    }
    private fun colorYellow(view: View){
        val box4 = findViewById<TextView>(R.id.boxFour)
        box4.setBackgroundColor(parseColor("#E9C855"))
    }
    private fun colorGreen(view: View){
        val box5 = findViewById<TextView>(R.id.boxFive)
        box5.setBackgroundColor(parseColor("#84E955"))
    }
    private fun colorReturn(view: View, box: Int){
        var boxcolor = findViewById<TextView>(R.id.boxOne)
        when (box) {
            2 -> {
                boxcolor = findViewById(R.id.boxTwo)
            }
            3 -> {
                boxcolor = findViewById(R.id.boxThree)
            }
            4 -> {
                boxcolor = findViewById(R.id.boxFour)
            }
            5 -> {
                boxcolor = findViewById(R.id.boxFive)
            }
        }
        boxcolor.setBackgroundColor(parseColor("#8DB877"))
    }
}