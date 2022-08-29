/*
 Crea un array de 10 posiciones de números con valores pedidos por teclado.
 Muestra por consola el indice y el valor al que corresponde.
 Haz dos métodos, uno para rellenar valores y otro para mostrar.
 */


package Arrays1;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int longitudArreglo= 10;
        int [] arreglo = new int[longitudArreglo];
        rellenarValores(arreglo);
        mostrarValores(arreglo);

    }

    public static void rellenarValores(int [] arreglo){
        for(int i=0; i < arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor"));
        }
    }

    public static void mostrarValores(int[] arreglo){
        for(int i=0; i < arreglo.length; i++){
            System.out.println("Posición "+i+" Valor: "+arreglo[i]);
        }
    }



}
