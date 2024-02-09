package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ganado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganado);
    }

    public void volverJugar(View view) {
        Intent intent = new Intent(Ganado.this, Juego.class);
        startActivity(intent);
    }
}