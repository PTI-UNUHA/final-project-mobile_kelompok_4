package com.example.jagohtmllnew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // --- 1. INISIALISASI TOMBOL NAVIGASI (SESUAI XML KAMU) ---
        val navMateri = findViewById<ImageView>(R.id.nav_materi)
        val btnNavLeaderboard = findViewById<ImageView>(R.id.btnNavLeaderboard)

        // --- 2. INISIALISASI TOMBOL MENU TENGAH (CARD) ---
        val btnMateri = findViewById<Button>(R.id.btnMateri)
        val btnKuis = findViewById<Button>(R.id.btnKuis)

        // --- 3. LOGIKA KLIK TOMBOL TENGAH (NAVIGASI) ---
        navMateri.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }

        // --- 4. LOGIKA KLIK TOMBOL KANAN (LEADERBOARD) ---
        btnNavLeaderboard.setOnClickListener {
            val intent = Intent(this, LeaderboardActivity::class.java)
            startActivity(intent)
        }

        // --- 5. LOGIKA KLIK TOMBOL DI DALAM CARD (OPSIONAL) ---
        btnMateri.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }

        // Kamu bisa tambahkan intent untuk Kuis di sini nanti
    }
}