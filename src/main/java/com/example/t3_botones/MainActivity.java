package com.example.t3_botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton bAleatorio, bGanador, bDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }
    private void acciones() {
        bAleatorio.setOnClickListener(this);
        bGanador.setOnClickListener(this);
        bDado.setOnClickListener(this);
    }

    private void instancias() {
        bAleatorio = findViewById(R.id.boton_aleatorio);
        bGanador = findViewById(R.id.boton_ganador);
        bDado= findViewById(R.id.boton_dados);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.boton_aleatorio:
                intent = new Intent(getApplicationContext(),AleatorioActivity.class);
                break;
            case R.id.boton_ganador:


        }

        startActivity(intent);
    }
}