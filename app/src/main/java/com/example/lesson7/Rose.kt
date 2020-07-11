package com.example.lesson7

import android.util.Log

class Rose : Plants() {

    override fun grow(){
        Log.d("grow", "Растет роза")
    }
}