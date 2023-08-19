package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
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







    }
}