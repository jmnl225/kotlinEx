package com.ljm.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        main()
        main2()
    }

    private fun main(){
        println("Hello world!")
    }

    private fun printMessage(message: String): Unit{
        println(message)
    }

    private fun printMessageWithPrefix(message: String, prefix: String = "Info"){
        println("[$prefix] $message")
    }

    private fun sum(x: Int, y: Int): Int{
        return x + y
    }

    private fun main2(){
        printMessage("Hello")
        printMessageWithPrefix("Hello", "Log")
        printMessageWithPrefix("Hello")
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        println(sum(1,2))
        println(multiply(2,4))
    }

    private fun multiply(x: Int, y: Int) = x*y

}