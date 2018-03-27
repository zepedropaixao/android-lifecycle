package me.paixao.androidlifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private fun printLog(s:String) {
        // display a message in Logcat
        Log.e("Activity Lifecycle:", s)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printLog("onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        printLog("onStart Called")
    }

    override fun onRestart() {
        super.onRestart()
        printLog("onRestart Called")
    }

    override fun onResume(){
        super.onResume()
        printLog("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        printLog("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        printLog("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog("onDestroy Called")
    }
}
