package com.app.learning.androidmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.app.learning.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val edtName = findViewById<AppCompatEditText>(R.id.edtName)

        btnStart.setOnClickListener {
            val name = edtName.text.toString()
            if (name.isNotEmpty()) {
                //Log.i("Modo log", "Start: ${edtName.text.toString()}")
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}