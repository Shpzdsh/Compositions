package com.shpzdsh.compositions.domain.usecases

import com.shpzdsh.compositions.domain.entity.GameSettings
import com.shpzdsh.compositions.domain.entity.Level
import com.shpzdsh.compositions.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}