package dev.irving.portfolioapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.irving.portfolioapp.about.AboutScreen
import dev.irving.portfolioapp.diceroller.DiceRollerScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val dataSet = listOf(
            "Dice Roller",
            "About"
        )
        val adapter = MainAdapter(dataSet)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter.itemListener = object : MainAdapter.ItemListener {
            override fun onClickItemListener(item: String) {
                when (item) {
                    dataSet[0] -> startActivity(
                        Intent(
                            this@MainActivity, DiceRollerScreen::class.java
                        )
                    )
                    dataSet[1] -> startActivity(
                        Intent(
                            this@MainActivity, AboutScreen::class.java
                        )
                    )
                }
            }
        }
    }
}
