package com.example.minggu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView = findViewById<TextView>(R.id.textView)

        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        messageTextView.text = message

        val tombolKembali = findViewById <Button> (R.id.kembali)

        tombolKembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}