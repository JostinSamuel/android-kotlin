package com.app.learning.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.app.learning.androidmaster.firstapp.FirstAppActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnWelcomeApp = findViewById<Button>(R.id.btnWelcomeApp)
        btnWelcomeApp.setOnClickListener { navigateToWelcomeApp() }
    }

    private fun navigateToWelcomeApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}