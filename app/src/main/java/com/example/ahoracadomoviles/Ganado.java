package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Ganado extends AppCompatActivity {
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganado);
        if (media==null){
            media = MediaPlayer.create(this,R.raw.ganar);
        }
        if (!media.isPlaying()){
            media.start();
        }
    }

    public void volverJugar(View view) {
        Intent intent = new Intent(Ganado.this, Juego.class);
        startActivity(intent);
        media.stop();
        media.release();
        media=null;
    }
}