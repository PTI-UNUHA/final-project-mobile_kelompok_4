package com.example.jagohtmllnew

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard)

        val btnMateri: Button = findViewById(R.id.btnMateri)
        val btnKuis: Button = findViewById(R.id.btnKuis)

        btnMateri.setOnClickListener {
            // Intent to start MateriActivity
            val intent = intent(packageContext = this, cls = MateriActivity::class.java)
        }

        btnKuis.setOnClickListener {
            // Intent to start KuisActivity
            findViewById<Button>(R.id.btnKuis)
        }
    }

    private fun intent(
        packageContext: DashboardActivity,
        cls: Class<MateriActivity>
    ) {
    }
}

private fun DashboardActivity.intent(
    packageContext: DashboardActivity,
    cls: Class<MateriActivity>
) {
}
