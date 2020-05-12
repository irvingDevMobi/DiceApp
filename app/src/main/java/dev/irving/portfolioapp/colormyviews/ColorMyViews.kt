package dev.irving.portfolioapp.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import dev.irving.portfolioapp.R

class ColorMyViews : AppCompatActivity() {

    lateinit var box3: TextView
    lateinit var box4: TextView
    lateinit var box5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.color_my_views_screen)

        findViewById<TextView>(R.id.box_one_text).setOnClickListener { makeColored(it) }
        findViewById<TextView>(R.id.box_two_text).setOnClickListener { makeColored(it) }
        box3 = findViewById<TextView>(R.id.box_three_text)
        box3.setOnClickListener { makeColored(it) }
        box4 = findViewById<TextView>(R.id.box_four_text)
        box4.setOnClickListener { makeColored(it) }
        box5 = findViewById<TextView>(R.id.box_five_text)
        box5.setOnClickListener { makeColored(it) }
        findViewById<View>(R.id.container_color_views).setOnClickListener { makeColored(it) }
        findViewById<Button>(R.id.red_button).setOnClickListener { makeColored(it) }
        findViewById<Button>(R.id.yellow_button).setOnClickListener { makeColored(it) }
        findViewById<Button>(R.id.green_button).setOnClickListener { makeColored(it) }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> box3.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box4.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box5.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
