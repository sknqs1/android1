package com.example.android2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var button: Button
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText2)
        checkBox = findViewById(R.id.checkBox)
        button = findViewById(R.id.button)
        radioGroup = findViewById(R.id.radioGroup)

        button.setOnClickListener {
            val name = editText.text.toString()
            val surname = editText2.text.toString()
            val isChecked = checkBox.isChecked
            val selectedRadioButtonId = radioGroup.checkedRadioButtonId

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("surname", surname)
            intent.putExtra("isChecked", isChecked)
            intent.putExtra("selectedRadioButtonId", selectedRadioButtonId)
            startActivity(intent)
        }
    }
}