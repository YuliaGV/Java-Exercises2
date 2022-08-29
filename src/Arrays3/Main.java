/*
Crea un array de números de un tamaño pasado por teclado
El array contendrá números aleatorios primos entre los números deseados, por último nos indica el mayor de todos.
Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos los métodos que necesites.
 */

package Arrays3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int longitudArreglo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int [] arreglo = new int[longitudArreglo];

        int valorInferior = Integer.parseInt(JOptionPane.showInputDialog("El arreglo será rellenado con números primos " +
                "aleatorios en un rango. Ingresa el valor inferior del rango"));

        int valorSuperior = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor superior del rango"));

        rellenarArreglo(arreglo, valorInferior, valorSuperior);
        System.out.println("Mayor valor: "+valorMayor(arreglo));
        mostrarArreglo(arreglo);


    }

    public static void rellenarArreglo(int[] arr, int x, int y){
        int i=0;

        while(i<arr.length){
            int num = generarAleatorio(x, y);
            if(esPrimo(num)){
                arr[i] = num;
                i++;
            }
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

    public static int valorMayor(int[] arr){
        int mayor = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > mayor){
                mayor = arr[i];
            }
        }
        return mayor;
    }

    public static boolean esPrimo(int num){

        if (num > 1) {

            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int generarAleatorio(int a, int b){
        return (int)(Math.random()*(b+1-a) +a);
    }





}
