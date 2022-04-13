package com.example.activitylc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate method")

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart method")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume method")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause method")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart method")
    }

    fun onNextScreen(view: android.view.View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}