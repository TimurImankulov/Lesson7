package com.example.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oak = Oak()
        val rose = Rose()
        val cactus = Cactus()

        oak.grow()
        rose.grow()
        cactus.grow()

    }
}