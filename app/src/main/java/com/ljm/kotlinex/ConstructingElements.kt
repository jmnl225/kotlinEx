package com.ljm.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConstructingElements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constructing_elements)

        elementTest()
    }

    private fun elementTest(){
        val numbersSet = setOf("one", "two", "three", "four")
        val emptySet = mutableSetOf<String>()

        //short living pair "key" to "value"
        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)

        //apply fun을 이용해서 맵에 키-값을 입력할 수 있다.
        val numbersMap2 = mutableMapOf<String, String>().apply { this["one"] = "1"; this["two"] = "2" }
    }
}