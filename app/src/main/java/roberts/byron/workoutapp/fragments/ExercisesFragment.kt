package roberts.byron.workoutapp.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import roberts.byron.workoutapp.R
import roberts.byron.workoutapp.WorkoutApplication
import roberts.byron.workoutapp.retrofit.Muscles

class ExercisesFragment : Fragment(), Callback<Muscles> {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_exercises, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val application = activity?.application as WorkoutApplication
        val workoutApi = application.getWorkoutApi()

        val muscles = workoutApi.getMuscles()
        muscles.enqueue(this)
    }

    override fun onFailure(call: Call<Muscles>?, t: Throwable?) {

    }

    override fun onResponse(call: Call<Muscles>?, response: Response<Muscles>?) {
        val muscles = response?.body()?.results?.toMutableList()
    }
}