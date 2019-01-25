package roberts.byron.workoutapp.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import roberts.byron.workoutapp.R

class MuscleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val musclesName = view.findViewById<TextView>(R.id.muscleName)
}