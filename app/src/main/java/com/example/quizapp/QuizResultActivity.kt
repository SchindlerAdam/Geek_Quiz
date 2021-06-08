package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_quiz_result.*

class QuizResultActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN



        val userNameFromQuizQuestionActivity = intent.getStringExtra(Constants.USER_NAME)
        val correctAnswersFromQuizQuestionActivity = intent.getStringExtra(Constants.CORRECT_ANSWERS)
        tv_resultName.text = "${userNameFromQuizQuestionActivity?.toUpperCase()}!"
        tv_result_score_id.text = "$correctAnswersFromQuizQuestionActivity/20"

        btn_new_game.setOnClickListener{
            val intent = Intent(this@QuizResultActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}


