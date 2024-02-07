package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
    }

    public void volverinicio(View view) {
        Intent intent = new Intent(Informacion.this, MainActivity.class);
        startActivity(intent);
    }
}