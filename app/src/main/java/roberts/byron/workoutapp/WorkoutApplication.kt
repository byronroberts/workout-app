package roberts.byron.workoutapp

import android.app.Application
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import roberts.byron.workoutapp.retrofit.WorkoutAPI


val BASE_URL = "https://wger.de/api/v2/"

class WorkoutApplication : Application() {

    private lateinit var workoutApi: WorkoutAPI

    override fun onCreate() {
        super.onCreate()

        val gson = GsonBuilder()
            .setLenient()
            .create()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        workoutApi = retrofit.create(WorkoutAPI::class.java)
    }

    fun getWorkoutApi() = workoutApi
}