package com.example.examen_amst_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Formulario {
   List<Pregunta> preguntas;
   int correctas;
   int preguntadas=0;
   private Pregunta preguntaActual;
   List<Integer> visitados= new ArrayList<Integer>();
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
       Pregunta pregunta1= new Pregunta("  ¿Qué le pasó a Anakin Skywalker durante la batalla con el Conde Dooku?", respuesta1,1);
       List<String> respuesta2= new ArrayList<String>();
       respuesta2.add("Jay Laga'aia");
       respuesta2.add("Temuera Morrison");
       respuesta2.add("Ahmed Best");
       respuesta2.add("Joel Edgerton");
       Pregunta pregunta2= new Pregunta(" ¿Quién hizo el papel del comandante Cody?", respuesta2,1);
       List<String> respuesta3= new ArrayList<String>();
       respuesta3.add("Su mano izquierda");
       respuesta3.add("Su pie izquierdo");
       respuesta3.add("Su mano derecha");
       respuesta3.add("Su pierna izquierda");
       Pregunta pregunta3= new Pregunta("  ¿Qué perdió Luke Skywalker en su pelea con Darth Vader?", respuesta3,2);
       List<String> respuesta4= new ArrayList<String>();
       respuesta4.add("Su fe en el Lado Luminoso de la Fuerza");
       respuesta4.add("Su fe en sus amigos");
       respuesta4.add("Su falta de visión");
       respuesta4.add("Su resistencia al Lado Oscuro de la Fuerza");
       Pregunta pregunta4= new Pregunta(" Según el Emperador, ¿cuál era la debilidad de Luke Skywalker?", respuesta4,1);
       List<String> respuesta5= new ArrayList<String>();
       respuesta5.add("Tatooine");
       respuesta5.add("Geonosis");
       respuesta5.add("Naboo");
       respuesta5.add("Coruscant");
       Pregunta pregunta5= new Pregunta(" ¿Dónde comenzaron las Guerras Clon?", respuesta5,1);
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
       while (visitados.contains(n)){
           n = rand.nextInt(4) + 1;
       }
       visitados.add(n);
       preguntaActual=preguntas.get(n);
       preguntadas++;
       return preguntaActual;
   }

   public boolean responderPregunta(int opcion){
       boolean esCorrecta= preguntaActual.verificarRespuesta(opcion);
       if(esCorrecta){
           correctas++;
       }
       return esCorrecta;
   }

   public String getCorrectas(){
       StringBuilder sb = new StringBuilder(); // or StringBuffer
       sb.append(correctas);
       return sb.toString();
   }
   public int getPreguntadas(){
       return preguntadas;
   }
   public Pregunta getPreguntaActual(){
       return  preguntaActual;
   }

   public void resetearFormulario(int i){
       correctas=0;
       preguntadas=0;
   }
}
