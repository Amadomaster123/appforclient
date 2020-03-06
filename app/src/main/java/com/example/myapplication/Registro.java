package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    Button atrasreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        navatras();

    }

    public void navatras() {

        atrasreg = (Button) findViewById(R.id.atrasreg);

        atrasreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentar = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentar);

            }
        });

    }
}