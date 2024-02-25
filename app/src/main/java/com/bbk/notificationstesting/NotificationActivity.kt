package com.bbk.notificationstesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NotificationActivity : AppCompatActivity() {

    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        tv = findViewById(R.id.textView)
        val data = intent.getStringExtra("data")
        tv.text = data
    }
}