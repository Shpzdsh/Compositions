package com.shpzdsh.compositions.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswer: Int,
    val gameTimeInSeconds: Int,
) : Parcelable {

    val minCountOfRightAnswersString: String
        get() = minPercentOfRightAnswer.toString()

    val minPercentOfRightAnswerString: String
        get() = minPercentOfRightAnswer.toString()
}
