package roberts.byron.workoutapp.fragments

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import roberts.byron.workoutapp.R
import roberts.byron.workoutapp.WorkoutApplication
import roberts.byron.workoutapp.repository.MusclesRepository
import roberts.byron.workoutapp.retrofit.Muscles
import roberts.byron.workoutapp.viewmodel.MusclesViewModel
import roberts.byron.workoutapp.viewmodel.ViewModelFactory

class ExercisesFragment : Fragment() {

    private lateinit var viewModel: MusclesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_exercises, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this, ViewModelFactory(MusclesRepository(activity?.application as WorkoutApplication))).get(MusclesViewModel::class.java)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.getMuscles().observe(this, Observer<Muscles> { muscles ->

        })
    }

}