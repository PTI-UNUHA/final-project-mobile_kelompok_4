package com.example.jagohtmllnew

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LeaderboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)

        // --- 1. INISIALISASI KOMPONEN TAB ---
        val btnWeekly = findViewById<Button>(R.id.btnWeekly)
        val btnAllTime = findViewById<Button>(R.id.btnAllTime)

        val tvNama1 = findViewById<TextView>(R.id.tvNama1)
        val tvPoin1 = findViewById<TextView>(R.id.tvPoin1)
        val tvNama2 = findViewById<TextView>(R.id.tvNama2)
        val tvPoin2 = findViewById<TextView>(R.id.tvPoin2)
        val tvNama3 = findViewById<TextView>(R.id.tvNama3)
        val tvPoin3 = findViewById<TextView>(R.id.tvPoin3)

        // --- 2. INISIALISASI NAVIGASI BOTTOM (Sesuai nav.xml) ---
        val navHome = findViewById<ImageView>(R.id.nav_home)
        val navMateri = findViewById<ImageView>(R.id.nav_materi)
        // nav_leaderboard tidak perlu listener karena kita sudah di halaman ini

        // --- 3. LOGIKA TOMBOL SEMUA WAKTU ---
        btnAllTime.setOnClickListener {
            // Ubah Warna Tombol agar terlihat aktif
            btnAllTime.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#11D9F5"))
            btnAllTime.setTextColor(Color.BLACK)
            btnWeekly.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#1B1B3A"))
            btnWeekly.setTextColor(Color.WHITE)

            // Ganti Data ke Semua Waktu
            tvNama1.text = "Ahmad Mastah"
            tvPoin1.text = "950.000 Poin"
            tvNama2.text = "Siska Pro"
            tvPoin2.text = "820.000 Poin"
            tvNama3.text = "Bambang HTML"
            tvPoin3.text = "750.000 Poin"
        }

        // --- 4. LOGIKA TOMBOL MINGGUAN ---
        btnWeekly.setOnClickListener {
            // Ubah Warna Tombol agar terlihat aktif
            btnWeekly.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#11D9F5"))
            btnWeekly.setTextColor(Color.BLACK)
            btnAllTime.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#1B1B3A"))
            btnAllTime.setTextColor(Color.WHITE)

            // Kembalikan Data ke Mingguan (Mengambil dari strings.xml)
            tvNama1.text = getString(R.string.fikri_m)
            tvPoin1.text = getString(R.string._12_500_poin)
            tvNama2.text = getString(R.string.siti_n)
            tvPoin2.text = getString(R.string._11_890_poin)
            tvNama3.text = getString(R.string.budi_s)
            tvPoin3.text = getString(R.string._10_240_poin)
        }

        // --- 5. LOGIKA NAVIGASI BOTTOM ---

        // Pindah ke Dashboard (Home)
        navHome.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            // FLAG_ACTIVITY_CLEAR_TOP memastikan kita tidak menumpuk halaman
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }

        // Pindah ke Materi (Tombol Tengah)
        navMateri.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }
    }
}