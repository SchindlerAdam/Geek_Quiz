package com.example.quizapp

data class Questions(
    val id: Int,
    val question: String,
    val image: Int,
    val ansOne: String,
    val ansTwo:String,
    val ansThree:String,
    val ansFour:String,
    val correctAns:Int
) {
}