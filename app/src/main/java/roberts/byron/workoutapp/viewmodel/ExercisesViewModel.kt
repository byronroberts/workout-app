package roberts.byron.workoutapp.viewmodel

import android.arch.lifecycle.LiveData

import android.arch.lifecycle.ViewModel
import roberts.byron.workoutapp.repository.ExercisesRepository
import roberts.byron.workoutapp.retrofit.ExerciseCategories
import roberts.byron.workoutapp.retrofit.Muscles

class ExercisesViewModel(repo: ExercisesRepository) : ViewModel() {

    private var muscles : LiveData<Muscles> = repo.getMuscles()
    private var exerciseCategories : LiveData<ExerciseCategories> = repo.getExerciseCategories()

    fun getMuscles() : LiveData<Muscles> {
        return muscles
    }

    fun getExercises(): LiveData<ExerciseCategories>{
        return exerciseCategories
    }

}
