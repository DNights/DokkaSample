package com.dnights.dokkasample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * this is main activity
 */

class MainActivity : AppCompatActivity() {

    /**
     * @param [savedInstanceState] default param
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test1()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    fun test1(){
        println("test1")
    }
}
