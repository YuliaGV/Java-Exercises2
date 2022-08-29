/*
Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta,
se añadira a una cadena que se mostrara al final,
se dejará de insertar cuando se introduzca un -1.

Por ejemplo, si escribo los siguientes numeros
0 //Añadira la ‘A’
5 //Añadira la ‘F’
25 //Añadira la ‘Z’
50 //Error, inserte otro numero
-1 //fin

Cadena resultante: AFZ
 */

package Arrays5;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        char letrasMayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            letrasMayusculas[j] = (char) i;
        }

        String cadena = "";

        int posicion = 0;
        while(posicion != -1){
            posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una posición entre 0 y 25"));
            if(posicion >= 0 && posicion <=25){
                cadena += letrasMayusculas[posicion];
            }else{
                JOptionPane.showMessageDialog(null, "Posición no válida");
            }

        }
        System.out.println(cadena);






    }

}
