/*
Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
Obtén la suma de todos ellos y la media.
 */

package Arrays4;

public class Main {

    public static void main(String[] args) {

        int [] arreglo = new int [100];
        int sum = 0;

        for(int i= 0; i< arreglo.length; i++){
            arreglo[i] = i;
            sum += i;
        }

        double media = sum / arreglo.length;
        System.out.println(media);

    }

}
