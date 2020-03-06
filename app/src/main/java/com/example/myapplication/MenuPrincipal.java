package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        atrasMppa();



    }

    public void atrasMppa(){
        //igual que el anterior solo que para el boton de registro
        atras=(Button)findViewById(R.id.atrasmenu);//butregistro es el id del boton de la clase Mainactiviy

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentar =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentar);
            }
        });

    }



}
