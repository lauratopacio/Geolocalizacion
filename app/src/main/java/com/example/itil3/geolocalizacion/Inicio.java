package com.example.itil3.geolocalizacion;

/**
 * Created by itil3 on 05/04/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity{


    Button siguientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);

        siguientes=(Button)findViewById(R.id.next);



        siguientes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent siguiente=new Intent(Inicio.this,MainActivity.class);
                startActivity(siguiente);
            }
        });

    }




}