package com.shpzdsh.compositions.domain.usecases

import com.shpzdsh.compositions.domain.entity.Question
import com.shpzdsh.compositions.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private  const val COUNT_OF_OPTIONS = 6
    }
}