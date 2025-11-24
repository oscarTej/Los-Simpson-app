package com.example.los_simpson_app.feature

class GetAllCharactersUseCase (private val characterRepository: CharacterRepository) {

    suspend operator fun invoke (): Result<List<Character>>{
        return characterRepository.getAllCharacters()
    }
}