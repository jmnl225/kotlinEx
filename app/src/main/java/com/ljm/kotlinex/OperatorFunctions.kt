package com.ljm.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OperatorFunctions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operator_functions)

        operator fun Int.times(str: String) = str.repeat(this)
        println(2 * "Bye")

        operator fun String.get(range: IntRange) = substring(range)
        val str = "Always forgive your enemies; nothing annoys them so much"
        println(str[0..14])
    }


}