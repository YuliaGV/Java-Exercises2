/*
Crea dos arrays de números con una longitud pasada por teclado.
Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
después crea un nuevo array con el primer array (usa de nuevo new con el primer array)
con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.
Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con
la multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
Por último, muestra el contenido de cada array. Llama al final al recolector de basura.
 */

package Arrays7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int longitudArreglo= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud de los arrays"));

        int [] arreglo1 = new int[longitudArreglo];
        int [] arreglo2;

        rellenarArreglo(arreglo1,0, 10);

        arreglo2 = arreglo1;

        arreglo1 = new int[longitudArreglo];

        rellenarArreglo(arreglo1,10, 20);

        int [] arreglo3 = multiplicarArrays(arreglo1, arreglo2);

        mostrarValores(arreglo1);
        mostrarValores(arreglo2);
        mostrarValores(arreglo3);

        System.gc();

    }

    public static void rellenarArreglo(int[] arr, int x, int y){
        for(int i=0; i<arr.length; i++){
            arr[i] = generarAleatorio(x, y);
        }


    }

    public static int generarAleatorio(int a, int b){
        return (int)(Math.random()*(b+1-a) +a);
    }

    public static int[] multiplicarArrays(int[] arr1, int[] arr2){
        int [] resultado = new int[arr1.length];
        if(arr1.length == arr2.length){
            for(int i=0; i<arr1.length; i++){
                resultado[i] = arr1[i]*arr2[i];
            }
        }
        return resultado;
    }

    public static void mostrarValores(int[] arreglo){
        for(int i=0; i < arreglo.length; i++){
            System.out.println("Posición "+i+" Valor: "+arreglo[i]);
        }
    }

}
