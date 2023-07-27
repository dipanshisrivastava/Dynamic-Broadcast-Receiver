package com.example.headphonedynamicbroadcastreceiver

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var headphoneReceiver: HeadphoneBroadcastReceiver? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        headphoneReceiver = HeadphoneBroadcastReceiver()
        val filter = android.content.IntentFilter(Intent.ACTION_HEADSET_PLUG)
        registerReceiver(headphoneReceiver, filter)
    }
    override fun onDestroy() {
        super.onDestroy()

        // Unregister the broadcast receiver
        headphoneReceiver?.let {
            unregisterReceiver(it)
        }
    }
}