package com.fiap.cp4_mobile_inter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SegundaTela : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_segunda_tela)

        val btnpagethree: Button = findViewById(R.id.btnpagethree)

        btnpagethree.setOnClickListener{
            IrPraTerceiraTela()
        }
    }
    private fun IrPraTerceiraTela(){
        val terceiratela = Intent(this, TerceiraTela::class.java)
        startActivity(terceiratela)
    }
}