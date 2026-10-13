package edu.temple.dicethrow

import android.R.attr.fragment
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (supportFragmentManager.findFragmentById(R.id.fragmentContainerView) !is DieFragment)
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView, DieFragment())
                .commit()

        findViewById<Button>(R.id.rollDiceButton).setOnclickListener {
            (supportFragmentManager
                .findFragmentById(R.id.fragmentContainerView) as DieFragment).throwDie())

        }
    }
}