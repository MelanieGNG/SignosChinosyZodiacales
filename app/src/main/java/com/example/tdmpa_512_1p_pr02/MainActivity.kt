package com.example.tdmpa_512_1p_pr02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMostrar = findViewById<Button>(R.id.btnMostrar)
        btnMostrar.setOnClickListener{
            validarFecha()
        }
    }

    fun validarFecha(){
        var img = findViewById<ImageView>(R.id.imgSignos)
        var txtFecha = findViewById<EditText>(R.id.txtFecha)
        var txtResultado = findViewById<TextView>(R.id.txtResultado)
        var txtChino = findViewById<TextView>(R.id.txtSchino)

        var mes = txtFecha.text.toString().subSequence(3,5).toString().toInt()
        var dia = txtFecha.text.toString().subSequence(0,2).toString().toInt()

        when{
            (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) -> txtResultado.text = "Aries"
            (mes == 4 && dia >= 20 || mes == 5 && dia <= 21) -> txtResultado.text = "Tauro"
            (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) -> txtResultado.text = "Geminis"
            (mes == 6 && dia >= 21 || mes == 7 && dia <= 22) -> txtResultado.text = "Cancer"
            (mes == 7 && dia >= 23 || mes == 8 && dia <= 22) -> txtResultado.text = "Leo"
            (mes == 8 && dia >= 23 || mes == 9 && dia <= 22) -> txtResultado.text = "Virgo"
            (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) -> txtResultado.text = "Libra"
            (mes == 10 && dia >= 23 || mes == 11 && dia <= 21) -> txtResultado.text = "Escorpio"
            (mes == 11 && dia >= 22 || mes == 12 && dia <= 21) -> txtResultado.text = "Sagitario"
            (mes == 12 && dia >= 22 || mes == 1 && dia <= 19) -> txtResultado.text = "Capricornio"
            (mes == 1 && dia >= 20 || mes == 2 && dia <= 18) -> txtResultado.text = "Acuario"
            (mes == 2 && dia >= 19 || mes == 3 && dia <= 20) -> txtResultado.text = "Picis"
            else -> txtResultado.text = "No existes bro"
        }

        //07/17/2003
        var year = txtFecha.text.toString().subSequence(6,10).toString().toInt()
        var imagenSchino = R.drawable.ic_launcher_foreground

        when{
            (year == 2000 || year == 2012 || year == 1988) -> txtChino.text = "Dragon"
            (year == 1996 || year == 2008 || year == 2020) -> txtChino.text = "Rata"
            (year == 1997 || year == 2009 || year == 2021) -> txtChino.text = "Buey"
            (year == 1998 || year == 2010 || year == 2022) -> txtChino.text = "Tigre"
            (year == 1999 || year == 2011 || year == 2023) -> txtChino.text = "Conejo"
            (year == 2001 || year == 2013 || year == 1989) -> txtChino.text = "Serpiente"
            (year == 2002 || year == 2014 || year == 1990) -> txtChino.text = "Caballo"
            (year == 2003 || year == 2015 || year == 1991) -> txtChino.text = "Cabra"
            (year == 2004 || year == 2016 || year == 1992) -> txtChino.text = "Mono"
            (year == 2005 || year == 2017 || year == 1993) -> txtChino.text = "Gallo"
            (year == 2006 || year == 2018 || year == 1994) -> txtChino.text = "Perro"
            (year == 2007 || year == 2019 || year == 1995) -> txtChino.text = "Cerdo"
            else -> txtChino.text = "No Disponible Sorry"

        }

        when{
            txtChino.text == "Dragon" -> img.setImageResource(R.drawable.dragon)
            txtChino.text == "Rata" -> img.setImageResource(R.drawable.rata)
            txtChino.text == "Buey" -> img.setImageResource(R.drawable.toro)
            txtChino.text == "Tigre" -> img.setImageResource(R.drawable.tigre)
            txtChino.text == "Conejo" -> img.setImageResource(R.drawable.rabit)
            txtChino.text == "Serpiente" -> img.setImageResource(R.drawable.serpiente)
            txtChino.text == "Cabra" -> img.setImageResource(R.drawable.cabra)
            txtChino.text == "Mono" -> img.setImageResource(R.drawable.mono)
            txtChino.text == "Gallo" -> img.setImageResource(R.drawable.gallo)
            txtChino.text == "Perro" -> img.setImageResource(R.drawable.perro)
            txtChino.text == "Cerdo" -> img.setImageResource(R.drawable.cerdo)
            txtChino.text == "Caballo" -> img.setImageResource(R.drawable.horse)

        }

        var txtFrase = findViewById<TextView>(R.id.idFrase)

        when{
            txtChino.text == "Dragon" -> txtFrase.text = "No seas flojo!"
            txtChino.text == "Rata" -> txtFrase.text = "Este sera tu mejor año!"
            txtChino.text == "Buey" -> txtFrase.text = "Se Feliz bro"
            txtChino.text == "Tigre" -> txtFrase.text = "Bts Best BG"
            txtChino.text == "Conejo" -> txtFrase.text = "Vive Feliz!"
            txtChino.text == "Serpiente" -> txtFrase.text = "Amor y Paz"
            txtChino.text == "Cabra" -> txtFrase.text = "Escucha a las twice"
            txtChino.text == "Mono" -> txtFrase.text = "El siguiente año te ira mejor"
            txtChino.text == "Gallo" -> txtFrase.text = "Suerte para la proxima"
            txtChino.text == "Perro" -> txtFrase.text = "Hasta la vista!"
            txtChino.text == "Cerdo" -> txtFrase.text = "Obedece a tus padres"
        }

    }
}