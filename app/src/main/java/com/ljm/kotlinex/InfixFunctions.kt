package com.ljm.kotlinex

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InfixFunctions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infix_functions)

        main()
    }

    private fun main(){

        infix fun Int.times(str: String) = str.repeat(this)
        println(2 times "Bye")

        val pair = "Ferrari" to "Katrina"
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)
        val myPair = "McLaren" onto "Lucas"
        println(myPair)

        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia
    }

    class Person(val name: String){
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person){likedPeople.add(other)}
    }
}