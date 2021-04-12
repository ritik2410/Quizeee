package com.example.quizkot

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity:AppCompatActivity() {
    var finalScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result1 = findViewById<TextView>(R.id.result1)
        val result2 = findViewById<TextView>(R.id.result2)
        val result3 = findViewById<TextView>(R.id.result3)
        val result4 = findViewById<TextView>(R.id.result4)
        val result5 = findViewById<TextView>(R.id.result5)
        val score = findViewById<TextView>(R.id.score)
        val q1r1 = findViewById<RadioButton>(R.id.q1o1)
        val q1r2 = findViewById<RadioButton>(R.id.q1o2)
        val q1r3 = findViewById<RadioButton>(R.id.q1o3)
        val q2r1 = findViewById<RadioButton>(R.id.q2o1)
        val q2r2 = findViewById<RadioButton>(R.id.q2o2)
        val q2r3 = findViewById<RadioButton>(R.id.q2o3)
        val q3r1 = findViewById<RadioButton>(R.id.q3o1)
        val q3r2 = findViewById<RadioButton>(R.id.q3o2)
        val q3r3 = findViewById<RadioButton>(R.id.q3o3)
        val q4r1 = findViewById<RadioButton>(R.id.q4o1)
        val q4r2 = findViewById<RadioButton>(R.id.q4o2)
        val q4r3 = findViewById<RadioButton>(R.id.q4o3)
        val q5r1 = findViewById<RadioButton>(R.id.q5o1)
        val q5r2 = findViewById<RadioButton>(R.id.q5o2)
        val q5r3 = findViewById<RadioButton>(R.id.q5o3)
        val button = findViewById<Button>(R.id.button)
        val r1 = findViewById<RadioGroup>(R.id.radio_group1)
        val r2 = findViewById<RadioGroup>(R.id.radio_group2)
        val r3 = findViewById<RadioGroup>(R.id.radio_group3)
        val r4 = findViewById<RadioGroup>(R.id.radio_group4)
        val r5 = findViewById<RadioGroup>(R.id.radio_group5)
        val reset = findViewById<Button>(R.id.reset)

        button.setOnClickListener {
            if (q1r1.isChecked) {
                finalScore -= 5
                result1.text = "Answer: Wrong"
            } else if (q1r2.isChecked) {
                finalScore += 10
                result1.text = "Answer: Correct"
            } else if (q1r3.isChecked) {
                finalScore -= 5
                result1.text = "Answer: Wrong"
            } else {
                result1.text = "Not Attempted!"
            }
            if (q2r1.isChecked) {
                finalScore -= 5
                result2.text = "Answer: Wrong"
            } else if (q2r3.isChecked) {
                finalScore += 10
                result2.text = "Answer: Correct"
            } else if (q2r2.isChecked) {
                finalScore -= 5
                result2.text = "Answer: Wrong"
            } else {
                result2.text = "Not Attempted!"
            }
            if (q3r1.isChecked) {
                finalScore -= 5
                result3.text = "Answer: Wrong"
            } else if (q3r2.isChecked) {
                finalScore += 10
                result3.text = "Answer: Correct"
            } else if (q3r3.isChecked) {
                finalScore -= 5
                result3.text = "Answer: Wrong"
            } else {
                result3.text = "Not Attempted!"
            }
            if (q4r2.isChecked) {
                finalScore -= 5
                result4.text = "Answer: Wrong"
            } else if (q4r1.isChecked) {
                finalScore += 10
                result4.text = "Answer: Correct"
            } else if (q4r3.isChecked) {
                finalScore -= 5
                result4.text = "Answer: Wrong"
            } else {
                result4.text = "Not Attempted!"
            }
            if (q5r2.isChecked) {
                finalScore -= 5
                result5.text = "Answer: Wrong"
            } else if (q5r1.isChecked) {
                finalScore += 10
                result5.text = "Answer: Correct"
            } else if (q5r3.isChecked) {
                finalScore -= 5
                result5.text = "Answer: Wrong"
            } else {
                result5.text = "Not Attempted!"
            }
            score.text = "Score: $finalScore"
            q1r1.isClickable = false
            q1r2.isClickable = false
            q1r3.isClickable = false
            q2r1.isClickable = false
            q2r2.isClickable = false
            q2r3.isClickable = false
            q3r1.isClickable = false
            q3r2.isClickable = false
            q3r3.isClickable = false
            q4r1.isClickable = false
            q4r2.isClickable = false
            q4r3.isClickable = false
            q5r1.isClickable = false
            q5r2.isClickable = false
            q5r3.isClickable = false
            button.visibility = View.GONE
            reset.visibility = View.VISIBLE
        }
        reset.setOnClickListener {
            finalScore = 0
            score.text = ""
            result1.text = ""
            result2.text = ""
            result3.text = ""
            result4.text = ""
            result5.text = ""
            r1.clearCheck()
            r2.clearCheck()
            r3.clearCheck()
            r4.clearCheck()
            r5.clearCheck()
            q1r1.isClickable = true
            q1r2.isClickable = true
            q1r3.isClickable = true
            q2r1.isClickable = true
            q2r2.isClickable = true
            q2r3.isClickable = true
            q3r1.isClickable = true
            q3r2.isClickable = true
            q3r3.isClickable = true
            q4r1.isClickable = true
            q4r2.isClickable = true
            q4r3.isClickable = true
            q5r1.isClickable = true
            q5r2.isClickable = true
            q5r3.isClickable = true
            reset.visibility = View.GONE
            button.visibility = View.VISIBLE
        }

    }
}