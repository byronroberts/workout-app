package com.example.workoutapp.service

data class ExerciseResponse(val results: List<Exercise>?)
data class Exercise(val id: Int?, val name: String?)
