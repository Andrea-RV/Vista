package com.example.vista.View.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.vista.Model.Repository.UsuarioRepositorio
import com.example.vista.Model.data.usuario
import com.example.vista.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = usuario()

        UsuarioRepositorio.onLogin()

        containedButton.setOnClickListener(){
            val nombre :String = miNombre.text.toString()

            mandaNombre(nombre)


        }



    }

    private fun mandaNombre(mensaje: String) : Boolean {
       val i: Intent = Intent(this, Tarea2Activity::class.java)
       i.putExtra("mensaje", mensaje)
        startActivity(i)

        return true
    }


    }


