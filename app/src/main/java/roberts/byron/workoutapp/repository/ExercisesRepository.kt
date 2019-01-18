package roberts.byron.workoutapp.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import roberts.byron.workoutapp.WorkoutApplication
import roberts.byron.workoutapp.retrofit.ExerciseCategories
import roberts.byron.workoutapp.retrofit.Muscles

class ExercisesRepository(application: WorkoutApplication) {

    private val webService = application.getWorkoutApi()

    fun getMuscles(): LiveData<Muscles> {
        val data: MutableLiveData<Muscles> = MutableLiveData()
        webService.getMuscles().enqueue(object : Callback<Muscles> {
            override fun onFailure(call: Call<Muscles>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<Muscles>?, response: Response<Muscles>?) {
                data.value = response?.body()
            }

        })

        return data
    }

    fun getExerciseCategories(): LiveData<ExerciseCategories> {
        val data: MutableLiveData<ExerciseCategories> = MutableLiveData()
        webService.getExerciseCategories().enqueue(object : Callback<ExerciseCategories>{
            override fun onFailure(call: Call<ExerciseCategories>?, t: Throwable?) {

            }

            override fun onResponse(call: Call<ExerciseCategories>?, response: Response<ExerciseCategories>?) {
                data.value = response?.body()
            }

        })

        return data
    }
}