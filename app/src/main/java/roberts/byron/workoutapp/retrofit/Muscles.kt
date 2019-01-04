package roberts.byron.workoutapp.retrofit

data class Muscles(val count: Int, val results: List<Muscle>)

data class Muscle(val id: Int, val name: String?)


