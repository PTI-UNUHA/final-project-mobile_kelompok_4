package com.example.jagohtmllnew

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DasboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard)

        val btnMateri: Button = findViewById(R.id.btnMateri)
        val btnKuis: Button = findViewById(R.id.btnKuis)

        btnMateri.setOnClickListener {
            // Intent to start MateriActivity
        }

        btnKuis.setOnClickListener {
            // Intent to start KuisActivity
        }
    }
}
