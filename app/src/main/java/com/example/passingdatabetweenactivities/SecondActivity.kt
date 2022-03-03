package com.example.passingdatabetweenactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvPerson = findViewById<TextView>(R.id.tvPerson)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person


        tvPerson.text = person.toString()


    }
}