package com.example.tugas1_225150407111086_pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etNama: EditText
    private lateinit var etNim: EditText
    private lateinit var btnTampilkan: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNama = findViewById(R.id.etNama)
        etNim = findViewById(R.id.etNim)
        btnTampilkan = findViewById(R.id.btnTampilkan)
        tvHasil = findViewById(R.id.tvHasil)

        btnTampilkan.setOnClickListener {
            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            tvHasil.text = "Nama: $nama\nNIM: $nim"
        }
    }
}