package com.example.myapplication.kotlin

// 08. 제어 흐름
// if, else


fun main(args:Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // if/else
    if (a > b){
        println("a")
    }
    else {
        println("b")
    }
    println("3번")

    // if/else/

    if (a > b){
        println("a")
    }

    // if/else/else if
    if (a>b) {
        println("a")
    }
    else if (a<b)
    else {
        println("a==b")
    }

    // 값을 리턴하는 if

    val max = if (a>b) {
        a
    }
    else {
        b
    }

    println(max)
}