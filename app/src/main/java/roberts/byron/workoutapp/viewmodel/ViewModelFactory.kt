package roberts.byron.workoutapp.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import roberts.byron.workoutapp.repository.ExercisesRepository

class ViewModelFactory(private val repo: ExercisesRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ExercisesViewModel(repo) as T
    }
}