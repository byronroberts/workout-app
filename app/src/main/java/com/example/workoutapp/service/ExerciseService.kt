package com.example.workoutapp.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ExerciseService {

    @GET("exercise?")
    fun getExercises(@Query("language") languageCode: String = "2"): Call<ExerciseResponse>
}
