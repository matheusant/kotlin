package com.example.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view : View){
        var textoExibicao = findViewById<View>(R.id.txtExibicao) as TextView
        var textoResultado = findViewById<TextView>(R.id.txtResultado)
        var numeroSorteado = Random.nextInt(11)

        textoResultado.setText("Número sorteado é: $numeroSorteado")
        textoExibicao.setText("Número sorteado é: $numeroSorteado")

        Log.i("BOTAO", numeroSorteado.toString())
    }

}