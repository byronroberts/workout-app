package roberts.byron.workoutapp.retrofit

data class ExerciseCategories(var results: MutableList<Category>)

data class Category(var id: String?, var name: String?)