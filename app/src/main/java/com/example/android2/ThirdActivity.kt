package com.example.android2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val backButton: Button = findViewById(R.id.backButton)
        val lifecycleListView: ListView = findViewById(R.id.lifecycleListView)


        val lifecycleStates = arrayOf(
            "[timestamp1] Stan 1",
            "[timestamp2] Stan 2",
            "[timestamp3] Stan 3"
        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lifecycleStates)
        lifecycleListView.adapter = adapter


        backButton.setOnClickListener {
            finish()
        }
    }
}