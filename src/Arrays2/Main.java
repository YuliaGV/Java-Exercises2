/*
Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con
números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
 Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar),
 para mostrar el contenido y la suma del array
 */

package Arrays2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int longitudArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una longitud para el arreglo"));
        int [] arreglo = new int[longitudArreglo];

        rellenarArreglo(arreglo, 1, 9);
        mostrarArreglo(arreglo);

    }

    public static void rellenarArreglo(int[] arr, int x, int y ){

        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*(y-x+1)+x);
        }

    }

    public static void mostrarArreglo(int[] arr){

        int sumaArray = 0;
        for(int i=0; i<arr.length; i++){
            System.out.println("Pos: "+i+" Valor: "+arr[i]);
            sumaArray += arr[i];
        }
        System.out.println("Suma: "+sumaArray);

    }



}
