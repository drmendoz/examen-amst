package com.example.examen_amst_1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cuestionario extends AppCompatActivity {
    private Formulario formulario;
    TextView preguntaView;
    Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);
        preguntaView = (TextView) findViewById(R.id.pregunta);
        button1= (Button) findViewById(R.id.button) ;
        button2= (Button) findViewById(R.id.button2) ;
        button3= (Button) findViewById(R.id.button3) ;
        button4= (Button) findViewById(R.id.button4) ;
        formulario= new Formulario();
        construirNuevaPregunta();
    }

    public void respondiendo1(View view) {
        boolean esCorrecta= formulario.responderPregunta(0);
        manejarRespuesta(esCorrecta);

    }

    public void respondiendo2(View view) {
        boolean esCorrecta= formulario.responderPregunta(1);
        manejarRespuesta(esCorrecta);
    }
    public void respondiendo3(View view) {
        boolean esCorrecta= formulario.responderPregunta(2);
        manejarRespuesta(esCorrecta);

    }
    public void respondiendo4(View view) {
        boolean esCorrecta= formulario.responderPregunta(3);
        manejarRespuesta(esCorrecta);

    }

    private void manejarRespuesta(boolean esCorrecta){
        if(esCorrecta){
            int preguntadas= formulario.getPreguntadas();
            if(preguntadas==4){
                Intent intent = new Intent(this, CodigoQR.class);
                startActivity(intent);
            }else{
                formulario.getPregunta();
                construirNuevaPregunta();
            }
        }else{
            Intent intent = new Intent(this, Resultado.class);
            String correctas= formulario.getCorrectas();
            intent.putExtra("correctas", correctas);
            startActivity(intent);
        }
    }

    private void construirNuevaPregunta(){
        Pregunta pregunta= formulario.getPreguntaActual();
        pregunta.toString();
        preguntaView.setText(pregunta.getPregunta());
        button1.setText(pregunta.getRespuesta(0));
        button2.setText(pregunta.getRespuesta(1));
        button3.setText(pregunta.getRespuesta(2));
        button4.setText(pregunta.getRespuesta(3));
    }




}