package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewStub
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var stub: ViewStub
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.more).setOnClickListener { onMoreClick(it) }
    }

    private fun onMoreClick(view: View) {
        stub = findViewById(R.id.view_stub)
        val inflated: View = stub.inflate()
        view.visibility = View.GONE
    }
}