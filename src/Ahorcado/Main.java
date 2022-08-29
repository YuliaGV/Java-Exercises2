/*
Juego del ahorcado
 */

package Ahorcado;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       String [] listaPalabras = {"Javascript", "HTML", "Tag", "React", "Hooks", "CSS", "Responsive", "Selector"};

       String palabra = obtenerPalabra(listaPalabras);

       char[] palabraOculta = ocultarPalabra(palabra);

       boolean palabraAdivinada = false;

       Scanner sc = new Scanner(System.in);


       int numIntentos = 0;
       String [] listaIntentos = {"la cabeza","el cuerpo","el brazo izquierdo","el brazo derecho","la pierna izquierda","la pierna derecha"};

       System.out.println("Bienvenido al juego del ahorcado. " +
                "\n Hoy tendremos terminos relacionados con el desarrollo web front, en ingles");


       do{
           System.out.println("Palabra: "+new String(palabraOculta));
           System.out.print("Ingresa una letra: ");
           char letra = sc.next().toLowerCase().charAt(0);

           boolean acierto = false;

           for(int i=0; i<palabra.length(); i++){
               if(palabra.toLowerCase().charAt(i) == letra){
                   palabraOculta[i] = letra;
                   acierto = true;
               }
           }

           if(!acierto){
               System.out.println("No acertaste, vamos a dibujar "+listaIntentos[numIntentos]);
               numIntentos++;
               System.out.println("Intentos restantes: "+(6-numIntentos));
           }else{
               if(!new String(palabraOculta).contains("_")){
                   System.out.println("Lo hiciste genial, la palabra era: "+palabra);
                   palabraAdivinada = true;
               }else{
                   System.out.println("Genial, acertaste una letra");
               }

           }


       }while(palabraAdivinada == false && numIntentos < 6);

       System.out.println("Adios");
       sc.close();

    }

    static int generarAleatorio(int a, int b){
        return (int)(Math.random()*(b+1-a) + a);
    }

    static String obtenerPalabra(String[] lista){
        return lista[generarAleatorio(0, lista.length-1)];
    }

    static char[] ocultarPalabra(String palabra) {

        char [] letrasPalabra = new char[palabra.length()];

        for(int i=0; i<letrasPalabra.length; i++){
            letrasPalabra[i] = '_';
        }
        return letrasPalabra;
    }


}
