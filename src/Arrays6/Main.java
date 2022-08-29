/*
1.  Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
 Puedes hacer con o sin métodos de String.

 */

package Arrays6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        String frase = JOptionPane.showInputDialog("Ingresa una frase");

        char [] charArreglo = new char[frase.length()];

        for(int i=0; i<frase.length(); i++){
            charArreglo[i] = frase.charAt(i);
            System.out.println(charArreglo[i]);
        }


    }

}
