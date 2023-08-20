package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)


        val changeBtn : Button = findViewById(R.id.change_activity)

        changeBtn.setOnClickListener {

            // ---------------2가지 방식-------------------- 아래가 더 좋음 ( 길어지면 한 눈에 볼 수 있음 )

            //요청
//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//            intent2.apply {
//                this.putExtra("number1", 1)
//                this.putExtra("number2", 2)
//            }
//
//            //전송
//            startActivityForResult(intent2,200) //requestcode는 사실상 구분하기 위한 이름

            //암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com")) // 특정 사이트를 띄우고 싶을 때
            startActivity(intent)
        }
    }

    //요청 수락
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 200) {
            val result = data?.getIntExtra("result",0)
        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}
