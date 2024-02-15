package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Juego extends AppCompatActivity {
    EditText editText;
    TextView txt2,txt3,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,tLongitud;
    TextView txt;
    ArrayList<String> deportes = new ArrayList<String>();
    ArrayList<String> comidas = new ArrayList<String>();
    ArrayList<String> pueblos = new ArrayList<String>();
    String palabra;
    ImageView horca;
    int vidas=6;

    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        txt = findViewById(R.id.textView12);
        txt2=findViewById(R.id.textView8);
        txt3=findViewById(R.id.textView77);
        editText = findViewById(R.id.editTextText2);
        t1 = findViewById(R.id.textView1);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
        t5 = findViewById(R.id.textView5);
        t6 = findViewById(R.id.textView6);
        t7 = findViewById(R.id.textView7);
        t8 = findViewById(R.id.textView8);
        t9 = findViewById(R.id.textView9);
        t10 = findViewById(R.id.textView10);
        tLongitud = findViewById(R.id.textView16);
        horca = findViewById(R.id.Imagenhorca);
        rellenarArrayList();
        palabra=aleatorizarPalabra();

        if (media==null){
            media = MediaPlayer.create(this,R.raw.jugar);
        }
        if (!media.isPlaying()){
            media.start();
        }

        editText.setOnKeyListener(new TextView.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                boolean existir = false;
                // Verificar si se presionó la tecla de acción
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Obtener el texto del EditText
                    String texto = editText.getText().toString();
                    // Mostrar el primer carácter
                    if (!texto.isEmpty()) {
                        char primerCaracter = texto.charAt(0);
                        txt.setText(txt.getText() + "-" + primerCaracter);
                        editText.setText("");
                        for(int i=0;i<palabra.length();i++){
                            if(palabra.charAt(i)==primerCaracter){
                                if(i==0){
                                    t1.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==1){
                                    t2.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==2){
                                    t3.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==3){
                                    t4.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==4){
                                    t5.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==5){
                                    t6.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==6){
                                    t7.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==7){
                                    t8.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==8){
                                    t9.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }else if(i==9){
                                    t10.setText(String.valueOf(palabra.charAt(i)));
                                    existir=true;
                                }
                            }
                        }
                        if(!existir){
                            vidas=vidas-1;
                            if(vidas==5){
                                horca.setImageResource(R.drawable.uno);
                            } else if(vidas==4){
                                horca.setImageResource(R.drawable.dos);
                            }else if(vidas==3){
                                horca.setImageResource(R.drawable.tres);
                            }else if(vidas==2){
                                horca.setImageResource(R.drawable.cuatro);
                            }else if(vidas==1){
                                horca.setImageResource(R.drawable.cinco);
                            } else if(vidas==0){
                                horca.setImageResource(R.drawable.seis);
                                esperar();
                            }
                        }else{
                            if(palabra.length()==4){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==5){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==6){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!="" && t6.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==7){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!="" && t6.getText()!="" && t7.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==8){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!="" && t6.getText()!="" && t7.getText()!="" && t8.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==9){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!="" && t6.getText()!="" && t7.getText()!="" && t8.getText()!="" && t9.getText()!=""){
                                    esperar2();
                                }
                            }else if(palabra.length()==10){
                                if(t1.getText()!="" && t2.getText()!="" && t3.getText()!="" && t4.getText()!="" && t5.getText()!="" && t6.getText()!="" && t7.getText()!="" && t8.getText()!="" && t9.getText()!="" && t10.getText()!=""){
                                    esperar2();
                                }
                            }
                        }

                    } else {
                        Toast.makeText(Juego.this, "El campo está vacío", Toast.LENGTH_SHORT).show();
                    }
                    return true;
                }
                return false;

            }

        });


    }

    public  void esperar2() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                media.stop();
                media.release();
                media=null;
                Intent intent = new Intent(Juego.this, Ganado.class);
                startActivity(intent);
            }
        };
        timer.schedule(task, 2000);
    }

    public  void esperar() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                media.stop();
                media.release();
                media=null;
                Intent intent = new Intent(Juego.this, Perdido.class);
                startActivity(intent);
            }
        };
        timer.schedule(task, 2000);
    }

    public String aleatorizarPalabra(){
        int aleatorio=(int)(1+Math.random()*3);
        String palabra;
        if(aleatorio==1){
            aleatorio=(int)(Math.random()*deportes.size());
            palabra = deportes.get(aleatorio);
            tLongitud.setText(String.valueOf(palabra.length()));
            deportes.remove(deportes.get(aleatorio));
            txt3.setText("Deporte");
        }else if(aleatorio==2){
            aleatorio=(int)(Math.random()*comidas.size());
            palabra = comidas.get(aleatorio);
            tLongitud.setText(String.valueOf(palabra.length()));
            comidas.remove(comidas.get(aleatorio));
            txt3.setText("Comida");
        }else{
            aleatorio=(int)(Math.random()*pueblos.size());
            palabra = pueblos.get(aleatorio);
            tLongitud.setText(String.valueOf(palabra.length()));
            pueblos.remove(pueblos.get(aleatorio));
            txt3.setText("Pueblos");
        }
        return palabra;
    }


    public void rellenarArrayList(){
        deportes.add("ciclismo");
        deportes.add("atletismo");
        deportes.add("natacion");
        deportes.add("futbol");
        deportes.add("badminton");
        deportes.add("golf");
        deportes.add("voleibol");
        deportes.add("ajedrez");
        deportes.add("boxeo");

        comidas.add("sopa");
        comidas.add("macarrones");
        comidas.add("pizza");
        comidas.add("espaguetis");
        comidas.add("paella");
        comidas.add("bizcocho");
        comidas.add("sandia");
        comidas.add("jamon");
        comidas.add("chorizo");
        comidas.add("queso");


        pueblos.add("membrilla");
        pueblos.add("daimiel");
        pueblos.add("manzanares");
        pueblos.add("llanos");
        pueblos.add("valdepeñas");
        pueblos.add("bolaños");
        pueblos.add("moral");
        pueblos.add("solana");
    }

    public void atras(View view) {
        media.stop();
        media.release();
        media=null;
        Intent intent = new Intent(Juego.this, MainActivity.class);
        startActivity(intent);
    }
}