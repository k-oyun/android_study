package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView



class Listner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listner)

    //  뷰를 액티비티로 가져오는 방법
        //1 직접 찾아서 가져온다
        //val textView : TextView = findViewById(R.id.hello)

        //2 xml 임포트해서 가져온다
        //hello.


        val textView : TextView = findViewById(R.id.hello)

        //람다 방식
        textView.setOnClickListener {
            Log.d("click","Click!")

        }

        val image : ImageView = findViewById(R.id.image)

        image.setOnClickListener {
            Log.d("click","Click!!")
        }

        var number = 10

        val click = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click", "Click!")
                textView.setText("안녕하세요") // 텍스트 바꾸기
                image.setImageResource(R.drawable.radius) // 이미지 바꾸기
                number += 10
                Log.d("number", "" + number)
                //빈 문자열 + 인트형 -> 스트링 타입으로
            }
        }









    }
}