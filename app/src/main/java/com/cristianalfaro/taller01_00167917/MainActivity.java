package com.cristianalfaro.taller01_00167917;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button boton;
    private EditText user, pass;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.usuario);
        pass = findViewById(R.id.pass);
        texto = findViewById(R.id.texto);

        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                texto.setText(user.getText());
                //Toast.makeText(MainActivity.this, user.getText(), Toast.LENGTH_LONG).show();
            }
        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                texto.setText(pass.getText());
                //Toast.makeText(MainActivity.this, pass.getText(), Toast.LENGTH_LONG).show();
                return true;
            }
        });



    }



}



