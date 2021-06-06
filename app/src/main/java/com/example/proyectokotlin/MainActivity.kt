package com.example.proyectokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


private var total: Int =0

private fun Sumar(){
    total++
}
private fun Restar(){
    total--
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonSumar = findViewById<Button>(R.id.btnSumar)
        val botonRestar = findViewById<Button>(R.id.btnRestar)
        val texto = findViewById<TextView>(R.id.textoContador)

        texto.text = "0"
        botonSumar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                 Sumar()
                texto.text = total.toString()
            }

        })

        botonRestar.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Restar()
                texto.text = total.toString()
            }

        })
    }
}
