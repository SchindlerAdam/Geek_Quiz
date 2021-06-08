package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bad_result.*

class BadResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bad_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN



        var userNameFromQuizQuestionsActivity = intent.getStringExtra(Constants.USER_NAME)
        var correctAnswerFromQuizQuestionActivity = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        tv_resultName.text = "${userNameFromQuizQuestionsActivity?.toUpperCase()}..."
        tv_result_score_id.text = "$correctAnswerFromQuizQuestionActivity/20"

        btn_new_game.setOnClickListener{
            val intent = Intent(this@BadResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}