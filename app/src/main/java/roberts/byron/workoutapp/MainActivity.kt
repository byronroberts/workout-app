package roberts.byron.workoutapp

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import roberts.byron.workoutapp.fragments.ExercisesFragment
import roberts.byron.workoutapp.fragments.HomeFragment
import roberts.byron.workoutapp.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigationHome -> {
                val homeFragment = HomeFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentContainer, homeFragment)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigationExercises -> {
                val exercisesFragment = ExercisesFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentContainer, exercisesFragment)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigationSettings -> {
                val settingsFragment = SettingsFragment()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.add(R.id.fragmentContainer, settingsFragment)
                transaction.commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
