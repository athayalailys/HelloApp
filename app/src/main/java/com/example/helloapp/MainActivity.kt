package com.example.helloapp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val btnSapa = findViewById<Button>(R.id.btnSapa)
        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvHello = findViewById<TextView>(R.id.tvHello)
        val layoutInput = findViewById<LinearLayout>(R.id.layoutInput)
        val layoutHello = findViewById<LinearLayout>(R.id.layoutHello)
        val switchMode = findViewById<Switch>(R.id.switchMode)

        btnSapa.setOnClickListener {
            val nama = etNama.text.toString()
            if (nama.isNotEmpty()) {
                tvHello.text = "Hello, $nama"
                layoutInput.visibility = View.GONE
                layoutHello.visibility = View.VISIBLE
            } else {
                etNama.error = "Nama tidak boleh kosong"
            }
        }

        btnBack.setOnClickListener {
            layoutHello.visibility = View.GONE
            layoutInput.visibility = View.VISIBLE
        }

        switchMode.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES
                )
            } else {
                AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO
                )
            }
        }
    }
}
