package com.example.jagohtmllnew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MateriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi_html)

        // Gunakan try-catch atau pengecekan null agar aplikasi tidak keluar (force close)
        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navLeaderboard = findViewById<ImageView>(R.id.nav_leaderboard)
        val btnNext = findViewById<Button>(R.id.btnNext)

        // Cek apakah navHome ditemukan di XML
        navHome?.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }

        // Cek apakah navLeaderboard ditemukan di XML
        navLeaderboard?.setOnClickListener {
            val intent = Intent(this, LeaderboardActivity::class.java)
            startActivity(intent)
        }

        btnNext?.setOnClickListener {
            Toast.makeText(this, "Materi Berikutnya", Toast.LENGTH_SHORT).show()
        }
        btnNext.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}
