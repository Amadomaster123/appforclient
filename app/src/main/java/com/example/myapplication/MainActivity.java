package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //creamos las variables de tipo boton
    Button btnring ,btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navegacionIngresar();
        navegacionregistro();


    }
//lo de la creacion de metodos es opcional yo lo hize para dar mas orden al codigo
    public void navegacionIngresar(){
        //llamamos las variables de los botonos para que al oprimir ese boton se intente acceder a una nueva pantalla
        btnring=(Button)findViewById(R.id.Ingresar);//Ingresar es el id del boton de la clase Mainactiviy

        btnring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //el intent cumple una funcion similar a un try
                Intent intentar =new Intent(getApplicationContext(),MenuPrincipal.class);//se llama a la clase Menuprinciapl
                startActivity(intentar);

            }
        });

    }

    public void navegacionregistro(){
       //igual que el anterior solo que para el boton de registro
        btnreg=(Button)findViewById(R.id.butregistro);//butregistro es el id del boton de la clase Mainactiviy

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //el intent cumple una funcion similar a un try
                Intent intentar =new Intent(getApplicationContext(),Registro.class);//se llama a la clase Registro
                startActivity(intentar);//Necesario para que funcione el Intent
            }
        });

    }


}
