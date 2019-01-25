package roberts.byron.workoutapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import roberts.byron.workoutapp.R
import roberts.byron.workoutapp.retrofit.Muscle
import roberts.byron.workoutapp.viewholders.MuscleViewHolder

class MusclesRecyclerViewAdapter : RecyclerView.Adapter<MuscleViewHolder>() {

    private var muscles: List<Muscle>? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): MuscleViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_item_muscles, viewGroup, false)
        return MuscleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return muscles?.size ?: 0
    }

    override fun onBindViewHolder(viewHolder: MuscleViewHolder, position: Int) {
        val muscle = muscles?.get(position)
        viewHolder.musclesName.text = muscle?.name
    }

    fun setMuscles(muscles: List<Muscle>?){
        this.muscles = muscles
        notifyDataSetChanged()
    }
}