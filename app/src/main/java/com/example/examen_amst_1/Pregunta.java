package com.example.examen_amst_1;

import java.util.List;

public class Pregunta {
    private String pregunta;
    private List<String> respuestas;
    private  int correcta;

    public Pregunta(String pregunta,List<String> respuestas,int correcta ) {
        this.pregunta = pregunta;
        this.respuestas=respuestas;
        this.correcta=correcta;
    }

    public String getRespuesta(int i){
        return respuestas.get(i);
    }

    public String getPregunta(){
        return  pregunta;
    }

    public Boolean verificarRespuesta(int i){
        if(i==correcta){
            return true;
        }
        return false;
    }
}
