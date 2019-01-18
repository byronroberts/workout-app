package roberts.byron.workoutapp.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface WorkoutAPI {

    @Headers("Accept: application/json")
    @GET("muscle")
    fun getMuscles() : Call<Muscles>

    @Headers("Accept: application/json")
    @GET("exercisecategory")
    fun getExerciseCategories() : Call<ExerciseCategories>
}