package com.example.sorteio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnEntrar = findViewById<Button>(R.id.btnEntrar)




    }

    fun clique(view : View){
        val edtUser = findViewById<EditText>(R.id.edtUser)
        val edtPass = findViewById<EditText>(R.id.edtPass)
        var txtLogin = findViewById<TextView>(R.id.txtLogin)

        var usuario = edtUser.text.toString()
        var senha = edtPass.text.toString()
        val basePath = android.os.Environment.getExternalStorageState().toString()
        var file = File(basePath+"/PASTA_SQL/${usuario}.txt")

        val intent = Intent(this, MainActivity::class.java)

        if (usuario.equals("") && senha.equals("")) Toast.makeText(this, "Usuário ou Senha em Branco", Toast.LENGTH_SHORT).show()
        else if (!usuario.equals("math") || !senha.equals("123")) Toast.makeText(this, "Usuário ou Senha Incorreto", Toast.LENGTH_SHORT).show()
        else{
           //startActivity(intent)
        }

        txtLogin.setText("Usuário ${usuario}_123")
        //txtLogin.setText("Usuário: $usuario\nSenha: $senha")
    }
}