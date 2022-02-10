package com.example.calculo_imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)
        val limpar = findViewById<Button>(R.id.limpar)

        calcular.setOnClickListener{

            val peso = findViewById<EditText>(R.id.peso).text.toString().toInt()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toInt()
            val resultado = findViewById<TextView>(R.id.resultado)

            val valor = (altura * altura) / peso

            if (valor >= 18,5){

                resultado.text = "voce está abaixo do peso"

            }
        }
    }
}