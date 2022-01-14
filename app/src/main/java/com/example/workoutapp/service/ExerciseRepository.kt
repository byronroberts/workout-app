package com.example.workoutapp.service

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ExerciseRepository private constructor(private val retrofitBuilder: Retrofit) {

    private val exerciseService by lazy { retrofitBuilder.create(ExerciseService::class.java) }

    companion object {
        fun create(): ExerciseRepository {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://wger.de/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return ExerciseRepository(retrofit)
        }
    }

    fun getExercises(): List<Exercise>? {
        val call = exerciseService.getExercises()
        var result: List<Exercise>? = null
        call.enqueue(object : Callback<ExerciseResponse> {
            override fun onResponse(call: Call<ExerciseResponse>, response: Response<ExerciseResponse>) {
                result = response.body()?.results
            }

            override fun onFailure(call: Call<ExerciseResponse>, t: Throwable) {
            }

        })
        return result
    }
}
