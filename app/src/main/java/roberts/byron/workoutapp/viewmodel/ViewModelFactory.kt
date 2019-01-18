package roberts.byron.workoutapp.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import roberts.byron.workoutapp.repository.MusclesRepository

class ViewModelFactory(private val repo: MusclesRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MusclesViewModel(repo) as T
    }
}