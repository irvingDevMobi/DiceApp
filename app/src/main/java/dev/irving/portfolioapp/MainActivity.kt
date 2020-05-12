package dev.irving.portfolioapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.irving.portfolioapp.about.AboutScreen
import dev.irving.portfolioapp.colormyviews.ColorMyViewsScreen
import dev.irving.portfolioapp.diceroller.DiceRollerScreen
import dev.irving.portfolioapp.trivia.TriviaScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val dataSet = listOf(
            "Dice Roller",
            "About",
            "Color My View",
            "Trivia"
        )
        val adapter = MainAdapter(dataSet)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.itemListener = object : MainAdapter.ItemListener {
            override fun onClickItemListener(item: String) {
                val screenClass = when (item) {
                    dataSet[0] -> DiceRollerScreen::class.java
                    dataSet[1] -> AboutScreen::class.java
                    dataSet[2] -> ColorMyViewsScreen::class.java
                    dataSet[3] -> TriviaScreen::class.java
                    else -> null
                }
                if (screenClass != null) {
                    startActivity(Intent(this@MainActivity, screenClass))
                }
            }
        }
    }
}
