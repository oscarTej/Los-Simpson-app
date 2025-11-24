package com.example.los_simpson_app.feature

interface CharacterRepository {

    suspend fun  getAllCharacters () : Result<List<Character>>
}