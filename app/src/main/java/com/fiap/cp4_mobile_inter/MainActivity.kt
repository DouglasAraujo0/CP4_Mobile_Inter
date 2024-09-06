package com.fiap.cp4_mobile_inter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnEntrar: Button = findViewById(R.id.btnEntrar)

        btnEntrar.setOnClickListener{
            IrPraSegundaTela()
        }
    }
    private fun IrPraSegundaTela(){
        val segundatela = Intent(this, SegundaTela::class.java)
        startActivity(segundatela)
    }
}