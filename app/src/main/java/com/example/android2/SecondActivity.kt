package com.example.android2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val summaryTextView: TextView = findViewById(R.id.summaryTextView)
        val backButton: Button = findViewById(R.id.backButton)
        val goToThirdButton: Button = findViewById(R.id.goToThirdButton)

        val intent = intent
        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val isChecked = intent.getBooleanExtra("isChecked", false)
        val selectedRadioButtonId = intent.getIntExtra("selectedRadioButtonId", -1)

        val summaryText = "Imię: $name\nNazwisko: $surname\nCzy zaznaczono warunki: $isChecked\nID zaznaczonego RadioButton: $selectedRadioButtonId"
        summaryTextView.text = summaryText

        backButton.setOnClickListener {
            finish()
        }

        goToThirdButton.setOnClickListener {
            val intentThird = Intent(this@SecondActivity, ThirdActivity::class.java)
            startActivity(intentThird)
        }
    }
}
