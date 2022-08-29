/*
 Crea una aplicación que pida un numero por teclado y después comprobaremos si el numero introducido es capicua,
  es decir, que se lee igual sin importar la dirección.
  Por ejemplo, si introducimos 30303 es capicua, si introducimos 30430 no es capicua.
  Piensa como puedes dar la vuelta al número.
  Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).
 */

package Arrays9;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));

        System.out.println(esCapicua(numero));

    }

    public static boolean esCapicua(int num){


        String [] arrayNumsReverse = new String[String.valueOf(num).length()];

        for(int i=String.valueOf(num).length()-1; i>=0; i-- ){
            arrayNumsReverse[i] = String.valueOf(String.valueOf(num).charAt(i));
        }

        if(String.valueOf(num).equals(String.join("", arrayNumsReverse))){
            return true;
        }else{
            return false;
        }

    }


}
