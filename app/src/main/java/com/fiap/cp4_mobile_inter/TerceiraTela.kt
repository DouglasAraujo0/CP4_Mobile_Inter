package com.fiap.cp4_mobile_inter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TerceiraTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_terceira_tela)

        val btnvoltar: Button = findViewById(R.id.btnvoltar)

        btnvoltar.setOnClickListener {
            VoltarPraPrimeiraTela()
        }
    }
    private fun VoltarPraPrimeiraTela(){
        val voltarPrimeiraTela = Intent(this, MainActivity::class.java)
        startActivity(voltarPrimeiraTela)
    }
}