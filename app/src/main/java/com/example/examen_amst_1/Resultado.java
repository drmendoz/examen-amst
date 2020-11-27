package com.example.examen_amst_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Resultado extends AppCompatActivity {
    TextView resultadoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Intent intent = getIntent();
        String correctas = (String) intent.getSerializableExtra("correctas");
        resultadoView= (TextView) findViewById(R.id.resultadoText);
        resultadoView.setText("Has respondido "+correctas+" preguntas correctas siguelo intentando");
    }

    public void volver(View view){
        Intent intent = new Intent(this, Cuestionario.class);
        startActivity(intent);
    }

    public void salir(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}