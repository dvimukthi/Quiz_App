package com.example.quizapp

object SetData {

    fun getQuestion():ArrayList<QuestionData>{
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1=QuestionData(
            question:"What is the capital of France",
            id:1,
            option_one:Marseille,
            option_two:Lyon,
            option_three:Paris,
            option_four:Nantes,
            correct_ans:3

        )
        que.add(q1)
        return que
    }
}