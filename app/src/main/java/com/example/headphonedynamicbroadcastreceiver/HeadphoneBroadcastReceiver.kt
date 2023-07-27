package com.example.headphonedynamicbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class HeadphoneBroadcastReceiver : BroadcastReceiver(){
    companion object {
        private const val TAG = "HeadphoneReceiver"
    }
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_HEADSET_PLUG) {
            val state = intent.getIntExtra("state", -1)
            if (state == 0)
            {
                Log.d(TAG, "Headphones unplugged")
            }
            else if (state == 1)
            {
                Log.d(TAG, "Headphones plugged")
            }
        }
    }
}