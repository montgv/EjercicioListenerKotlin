package com.example.ejerciciolistenerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciolistenerkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Creamos el binding que nos sirve para la vinculacion de vista
    private lateinit var binding: ActivityMainBinding

    //Este metodo es el metodo que se llama para que comience el activity
    override fun onCreate(savedInstanceState: Bundle?) {
        //Estas lineas hace que se nos vincule las vistas con el activity
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Definimos un escuchador para cuando pulsemos el boton evaluar haga lo que se va a definir dentro
        binding.btEvaluar.setOnClickListener {
            //Creamos las siguientes variables inmutables que se obtienen a traves del binding
            val valor1 = binding.txtMatematicas.text.toString().toInt()
            val valor2 = binding.txtFisica.text.toString().toInt()
            val valor3 = binding.txtQuimica.text.toString().toInt()

            //Creamos la variable inmutable media que calcula la media de las notas
            val media = (valor1 + valor2 + valor3) / 3

            //Si media es mayor o igual a 5, txtMedia muestre un texto y sino pues muestre otro texto
            if (media >= 5) {
                binding.txtMedia.text = "Aprobado con " + media + " de media"
            } else {
                binding.txtMedia.text = "Suspenso con " + media + " de media"
            }
        }
    }
}