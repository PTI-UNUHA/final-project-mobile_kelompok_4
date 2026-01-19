package com.example.jagohtmllnew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz)

        // 1. Inisialisasi View berdasarkan ID di XML Anda
        val mainView = findViewById<android.view.View>(R.id.main)
        val btnSrc = findViewById<Button>(R.id.btnsrc)
        val btnHref = findViewById<Button>(R.id.btnHref)
        val btnHint = findViewById<Button>(R.id.btnHint)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvSoal = findViewById<TextView>(R.id.tvSoal)

        // Pengaturan padding sistem (Edge-to-Edge)
        ViewCompat.setOnApplyWindowInsetsListener(mainView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 2. Logika Tombol Pilihan (Contoh Interaksi)
        btnSrc.setOnClickListener {
            tvSoal.text = "Anda memilih: src (Benar!)"
            btnSrc.setBackgroundColor(android.graphics.Color.GREEN)
            btnHref.setBackgroundColor(android.graphics.Color.GRAY)
        }

        btnHref.setOnClickListener {
            tvSoal.text = "Anda memilih: HREF (Salah!)"
            btnHref.setBackgroundColor(android.graphics.Color.RED)
            btnSrc.setBackgroundColor(android.graphics.Color.GRAY)
        }

        // 3. Logika Tombol Hint
        btnHint.setOnClickListener {
            Toast.makeText(this, "Petunjuk: Singkatan dari 'Source'", Toast.LENGTH_SHORT).show()
        }

        // 4. Logika Tombol Submit (Pindah ke Dashboard)
        btnSubmit.setOnClickListener {
            Toast.makeText(this, "Jawaban Tersimpan!", Toast.LENGTH_SHORT).show()

            // Perintah pindah halaman
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish() // Menutup QuizActivity agar tidak bisa di-back
        }
        // Tambahkan variabel di dalam onCreate
        var jumlahKesempatan = 1
        val btnKesempatan = findViewById<Button>(R.id.btnKesempatan)

// Logika ketika pengguna memilih jawaban yang salah (misal btnHref)
        btnHref.setOnClickListener {
            if (jumlahKesempatan > 0) {
                jumlahKesempatan-- // Berkurang 1
                btnKesempatan.text = "Kesempatan ($jumlahKesempatan)"
                Toast.makeText(this, "Jawaban Salah! Kesempatan berkurang.", Toast.LENGTH_SHORT).show()
            } else {
                // Jika kesempatan sudah 0
                Toast.makeText(this, "Kesempatan habis! Anda harus mengulang materi.", Toast.LENGTH_LONG).show()

                // Lempar kembali ke halaman Materi
                val intent = Intent(this, MateriActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}