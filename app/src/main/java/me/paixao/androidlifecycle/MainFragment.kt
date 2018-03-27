package me.paixao.androidlifecycle

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment: Fragment() {
 
    private fun printLog(s:String) {
        // display a message in Logcat
        Log.e("Fragment Lifecycle:", s)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        printLog("onActivityCreated Called")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.fragment_main, container, false)
        printLog("onCreateView Called")
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        printLog("onViewCreated Called")
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        printLog("onAttach Called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        printLog("onCreate Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog("onDestroy Called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        printLog("onDestroyView Called")
    }

    override fun onDetach() {
        super.onDetach()
        printLog("onDetach Called")
    }

    override fun onPause() {
        super.onPause()
        printLog("onPause Called")
    }

    override fun onResume() {
        super.onResume()
        printLog("onResume Called")
    }

    override fun onStart() {
        super.onStart()
        printLog("onStart Called")
    }

    override fun onStop() {
        super.onStop()
        printLog("onStop Called")
    }
}