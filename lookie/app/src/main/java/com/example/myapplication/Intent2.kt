package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val resultBtn: Button = findViewById(R.id.result)

        resultBtn.setOnClickListener {

            setContentView(R.layout.activity_intent2)

            //default값을 넣어줘야함. 인텐트를 받음
            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)

            Log.d("number","" + number1)
            Log.d("number","" + number2)


            val result = number1 + number2

            //인텐트 생성
            val resultIntent = Intent()
            resultIntent.putExtra("result",result)

            //결과 전송
            setResult(Activity.RESULT_OK,resultIntent)
            finish()

            //-> activity 종료

            // Stack 개념
            // Intent2 -> 종료 ( 사라짐 )
            // Intent1 ( 남음 )

        }
    }
}


