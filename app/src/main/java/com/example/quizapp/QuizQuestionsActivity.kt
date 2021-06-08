package com.example.quizapp

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.ContextCompat
import androidx.core.os.HandlerCompat.postDelayed
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*



class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

     private var mCurrentPosition: Int = 1
     private var mQuestionList: ArrayList<Questions>? = null
     private var mSelectedOptionPosition: Int = 0
     private var checkCorrectAns: TextView? = null
     private var correctAnswers: Int = 0
     private var userNameForResultActivity: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        userNameForResultActivity = intent.getStringExtra(Constants.USER_NAME)

        mQuestionList = Constants.getQuestions()

        setQuestions()

        ans_one.setOnClickListener(this)
        ans_two.setOnClickListener(this)
        ans_three.setOnClickListener(this)
        ans_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestions(){


        val question= mQuestionList!![mCurrentPosition - 1]


        defaultOptionView()

        tv_questions.text = question.question
        iv_image.setImageResource(question.image)
        ll_progressBar.progress = mCurrentPosition
        tv_progressBar.text = "$mCurrentPosition / ${ll_progressBar.max}"
        ans_one.text = question.ansOne
        ans_two.text = question.ansTwo
        ans_three.text = question.ansThree
        ans_four.text = question.ansFour
        btn_submit.text = "SUBMIT"
    }

    override fun onClick(v: View?){
        when(v?.id){
            R.id.ans_one -> selectedOptionView(ans_one,  1)
            R.id.ans_two -> selectedOptionView(ans_two, 2)
            R.id.ans_three -> selectedOptionView(ans_three, 3)
            R.id.ans_four -> selectedOptionView(ans_four, 4)
            R.id.btn_submit -> {
                if(mSelectedOptionPosition != 0) {
                    if (mCurrentPosition == mQuestionList!!.size) {
                        checkCorrectAns(checkCorrectAns!!)
                        btn_submit.text = "FINISH"
                        when(correctAnswers){
                            in 15..mQuestionList!!.size -> {
                                val intent = Intent(this@QuizQuestionsActivity, QuizResultActivity::class.java)
                                intent.putExtra(Constants.USER_NAME, userNameForResultActivity)
                                intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers.toString())
                                startActivity(intent)
                                finish()
                            }
                            in 0..14 ->{
                                val intent = Intent(this@QuizQuestionsActivity, BadResultActivity::class.java)
                                intent.putExtra(Constants.USER_NAME, userNameForResultActivity)
                                intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers.toString())
                                startActivity(intent)
                                finish()
                            }
                        }

                    } else {
                        btn_submit.text = "SUBMIT"
                        checkCorrectAns(checkCorrectAns!!)
                        mCurrentPosition++
                        Handler().postDelayed({ setQuestions() }, 500)
                    }
                }else {
                    Toast.makeText(this, "Select an answer!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun selectedOptionView(view: TextView, selectedOptionNum: Int){
        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface, Typeface.BOLD)
        view.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
        checkCorrectAns = view

    }


    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        options.add(0,ans_one)
        options.add(1, ans_two)
        options.add(2, ans_three)
        options.add(3, ans_four)

        for(item in options){
            item.setTextColor(Color.parseColor("#363A43"))
            item.typeface = Typeface.DEFAULT
            item.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }


    private fun checkCorrectAns(view: TextView){
        val question = mQuestionList!![mCurrentPosition - 1]

        if(mSelectedOptionPosition == question.correctAns){
            view.setTextColor(Color.parseColor("#363A43"))
            view.setTypeface(view.typeface, Typeface.BOLD_ITALIC)
            view.background = ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
            mSelectedOptionPosition = 0
            correctAnswers += 1
        }
        else{
            when (question.correctAns) {
                1 -> {
                    ans_one.setTextColor(Color.parseColor("#363A43"))
                    ans_one.setTypeface(view.typeface, Typeface.BOLD_ITALIC)
                    ans_one.background =
                        ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
                    view.setTextColor(Color.parseColor("#363A43"))
                    view.setTypeface(view.typeface, Typeface.BOLD)
                    view.background =
                        ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)
                    mSelectedOptionPosition = 0
                }
                2 -> {
                    ans_two.setTextColor(Color.parseColor("#363A43"))
                    ans_two.setTypeface(view.typeface, Typeface.BOLD_ITALIC)
                    ans_two.background =
                        ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
                    view.setTextColor(Color.parseColor("#363A43"))
                    view.setTypeface(view.typeface, Typeface.BOLD)
                    view.background =
                        ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)
                    mSelectedOptionPosition = 0
                }
                3 -> {
                    ans_three.setTextColor(Color.parseColor("#363A43"))
                    ans_three.setTypeface(view.typeface, Typeface.BOLD_ITALIC)
                    ans_three.background =
                        ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
                    view.setTextColor(Color.parseColor("#363A43"))
                    view.setTypeface(view.typeface, Typeface.BOLD)
                    view.background =
                        ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)
                    mSelectedOptionPosition = 0
                }
                4 -> {
                    ans_four.setTextColor(Color.parseColor("#363A43"))
                    ans_four.setTypeface(view.typeface, Typeface.BOLD_ITALIC)
                    ans_four.background =
                        ContextCompat.getDrawable(this, R.drawable.correct_option_border_bg)
                    view.setTextColor(Color.parseColor("#363A43"))
                    view.setTypeface(view.typeface, Typeface.BOLD)
                    view.background =
                        ContextCompat.getDrawable(this, R.drawable.wrong_option_border_bg)
                    mSelectedOptionPosition = 0
                }
            }
        }
    }
}
