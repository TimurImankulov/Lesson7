package com.example.lesson7

import android.util.Log
import android.widget.Toast

class Cactus : Plants(){

   override fun grow() {
       Log.d("grow", "Растет кактус")
   }
}