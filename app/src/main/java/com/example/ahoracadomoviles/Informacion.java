package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Informacion extends AppCompatActivity {
    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        if (media==null){
            media = MediaPlayer.create(this,R.raw.informacion);
        }
        if (!media.isPlaying()){
            media.start();
        }
    }

    public void volverinicio(View view) {
        Intent intent = new Intent(Informacion.this, MainActivity.class);
        startActivity(intent);
        media.stop();
        media.release();
        media=null;
    }
}