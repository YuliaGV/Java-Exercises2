/*
Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado
(debes controlar que se introduce un número correcto), estos deben guardarse en un nuevo array.

Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números acabados en 5,
podría salir 155, 25, etc.
 */

package Arrays8;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        int longitudArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la longitud del arreglo"));
        int [] arreglo = new int[longitudArreglo];

        rellenarArreglo(arreglo, 1, 300);

        int valorABuscar;

        do{
            String entrada =JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            valorABuscar = Integer.parseInt(entrada);
        }while(!(valorABuscar>=0 && valorABuscar<=9));

        mostrarValores(generarFinalizadosEn(arreglo, valorABuscar));

    }

    public static void rellenarArreglo(int[] arr, int x, int y){
        for(int i=0; i<arr.length; i++){
            arr[i] = generarAleatorio(x, y);
        }
    }
    public static int generarAleatorio(int a, int b){
        return (int)(Math.random()*(b+1-a) +a);
    }

    public static int[] generarFinalizadosEn (int[] arr, int valor){

        int [] finalizadosList = new int[arr.length];

        int ultimoNumero = 0;

        for(int i=0; i<finalizadosList.length; i++){

            ultimoNumero = arr[i]-(arr[i]/10*10);

            if (ultimoNumero==valor){
                finalizadosList[i]=arr[i];
            }

        }
        return finalizadosList;

    }

    public static void mostrarValores(int[] arreglo){
        for(int i=0; i < arreglo.length; i++){
            System.out.println("Posición "+i+" Valor: "+arreglo[i]);
        }
    }


}
