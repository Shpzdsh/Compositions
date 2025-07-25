package com.shpzdsh.compositions.domain.repository

import com.shpzdsh.compositions.domain.entity.GameSettings
import com.shpzdsh.compositions.domain.entity.Level
import com.shpzdsh.compositions.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}