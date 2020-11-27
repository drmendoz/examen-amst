package com.example.examen_amst_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Formulario {
   List<Pregunta> preguntas;
   int correctas;
   int preguntadas=0;
   private Pregunta preguntaActual;
   public Formulario(){
        crearPreguntas();
   }

   private void crearPreguntas(){
       preguntas= new ArrayList<Pregunta>();
       List<String> respuesta1= new ArrayList<String>();
       respuesta1.add("Perdió su pierna izquierda");
       respuesta1.add("Perdió su brazo derecho");
       respuesta1.add("Perdió su pierna derecha");
       respuesta1.add("Él perdió");
       Pregunta pregunta1= new Pregunta(" ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta1,1);
       List<String> respuesta2= new ArrayList<String>();
       respuesta2.add("Perdió su pierna izquierda");
       respuesta2.add("Perdió su brazo derecho");
       respuesta2.add("Perdió su pierna derecha");
       respuesta2.add("Él perdió");
       Pregunta pregunta2= new Pregunta(" ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta2,2);
       List<String> respuesta3= new ArrayList<String>();
       respuesta3.add("Perdió su pierna izquierda");
       respuesta3.add("Perdió su brazo derecho");
       respuesta3.add("Perdió su pierna derecha");
       respuesta3.add("Él perdió");
       Pregunta pregunta3= new Pregunta(" ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta3,3);
       List<String> respuesta4= new ArrayList<String>();
       respuesta4.add("Perdió su pierna izquierda");
       respuesta4.add("Perdió su brazo derecho");
       respuesta4.add("Perdió su pierna derecha");
       respuesta4.add("Él perdió");
       Pregunta pregunta4= new Pregunta(" ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta4,4);
       List<String> respuesta5= new ArrayList<String>();
       respuesta5.add("Perdió su pierna izquierda");
       respuesta5.add("Perdió su brazo derecho");
       respuesta5.add("Perdió su pierna derecha");
       respuesta5.add("Él perdió");
       Pregunta pregunta5= new Pregunta(" ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta5,5);
       preguntas.add(pregunta1);
       preguntas.add(pregunta2);
       preguntas.add(pregunta3);
       preguntas.add(pregunta4);
       preguntas.add(pregunta5);
       getPregunta();
   }

   public Pregunta getPregunta(){
       Random rand = new Random();

       int n = rand.nextInt(4) + 1;
       preguntaActual=preguntas.get(n);
       return preguntaActual;
   }

   public boolean responderPregunta(int opcion){
       boolean esCorrecta= preguntaActual.verificarRespuesta(opcion);
       if(esCorrecta){
           correctas++;
       }
       return esCorrecta;
   }

   public int getPreguntadas(){
       return preguntadas;
   }
   public Pregunta getPreguntaActual(){
       return  preguntaActual;
   }
}
