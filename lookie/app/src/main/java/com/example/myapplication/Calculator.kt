package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        //new -> old = new + old
        var new = "0" //새로 입력하는 값
        var old = "0" //이전에 입력했던 값

        var one : TextView=findViewById(R.id.one)
        var two : TextView=findViewById(R.id.two)
        var three : TextView=findViewById(R.id.three)
        var four : TextView=findViewById(R.id.four)
        var five : TextView=findViewById(R.id.five)
        var six : TextView=findViewById(R.id.six)
        var seven : TextView=findViewById(R.id.seven)
        var eight : TextView=findViewById(R.id.eight)
        var nine : TextView=findViewById(R.id.nine)


        var clear : TextView=findViewById(R.id.clear)
        var plus : TextView=findViewById(R.id.plus)
        var minus : TextView=findViewById(R.id.minus)
        var result : TextView=findViewById(R.id.result)


        one.setOnClickListener {
            new = new + "1"
            result.setText(new)
        }
        two.setOnClickListener {
            new = new + "2"
            result.setText(new)
        }
        three.setOnClickListener {
            new = new + "3"
            result.setText(new)
        }
        four.setOnClickListener {
            new = new + "4"
            result.setText(new)
        }
        five.setOnClickListener {
            new = new + "5"
            result.setText(new)
        }
        six.setOnClickListener {
            new = new + "6"
            result.setText(new) }
        seven.setOnClickListener {
            new = new + "7"
            result.setText(new)
        }
        eight.setOnClickListener {
            new = new + "8"
            result.setText(new)
        }
        nine.setOnClickListener {
            new = new + "9"
            result.setText(new)
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)

        }
        minus.setOnClickListener {
            old = (old.toInt() - new.toInt()).toString()
            new = "0"
            result.setText(old)
        }

        clear.setOnClickListener {
            old = "0"
            new = "0"
            result.setText("0")
        }



    }
}