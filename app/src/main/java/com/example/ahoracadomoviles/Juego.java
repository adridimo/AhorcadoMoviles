package com.example.ahoracadomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Juego extends AppCompatActivity {
    EditText editText;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
        txt = findViewById(R.id.textView12);
        editText = findViewById(R.id.editTextText2);
        editText.setOnKeyListener(new TextView.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // Verificar si se presionó la tecla de acción y si fue una pulsación hacia abajo
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // Obtener el texto del EditText
                    String texto = editText.getText().toString();
                    // Mostrar el primer carácter
                    if (!texto.isEmpty()) {
                        char primerCaracter = texto.charAt(0);
                        txt.setText(txt.getText() + "-" + primerCaracter);
                    } else {
                        Toast.makeText(Juego.this, "El campo está vacío", Toast.LENGTH_SHORT).show();
                    }
                    return true; // Indica que el evento ha sido consumido
                }
                return false; // Indica que el evento no ha sido consumido
            }
        });
    }
}