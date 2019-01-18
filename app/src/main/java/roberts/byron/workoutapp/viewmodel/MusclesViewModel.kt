package roberts.byron.workoutapp.viewmodel

import android.arch.lifecycle.LiveData

import android.arch.lifecycle.ViewModel
import roberts.byron.workoutapp.repository.MusclesRepository
import roberts.byron.workoutapp.retrofit.Muscles

class MusclesViewModel(repo: MusclesRepository) : ViewModel() {

    private var muscles : LiveData<Muscles> = repo.getMuscles()

    fun getMuscles() : LiveData<Muscles> {
        return muscles
    }

}
