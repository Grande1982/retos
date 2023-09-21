
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cgrande
 */

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String texto, codigoCambiado;
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el texto a transformar: ");
        texto = sc.nextLine();

        HashMap<Character, String> traductor = new HashMap<Character, String>();

        //letras
        traductor.put('a', "4");
        traductor.put('b', "I3");
        traductor.put('c', "[");
        traductor.put('d', ")");
        traductor.put('e', "3");
        traductor.put('f', "|=");
        traductor.put('g', "&");
        traductor.put('h', "#");
        traductor.put('i', "1");
        traductor.put('j', ",_|");
        traductor.put('k', ">|");
        traductor.put('l', "1");
        traductor.put('m', "/\\/\\");
        traductor.put('n', "^/");
        traductor.put('o', "0");
        traductor.put('p', "|*");
        traductor.put('q', "(_,)");
        traductor.put('r', "I2");
        traductor.put('s', "5");
        traductor.put('t', "7");
        traductor.put('u', "(_)");
        traductor.put('v', "\\/");
        traductor.put('w', "\\/\\/");
        traductor.put('x', "><");
        traductor.put('y', "j");
        traductor.put('z', "2");

        //numeros
        traductor.put('0', "o");
        traductor.put('1', "L");
        traductor.put('2', "R");
        traductor.put('3', "E");
        traductor.put('4', "A");
        traductor.put('5', "S");
        traductor.put('6', "b");
        traductor.put('7', "T");
        traductor.put('8', "B");
        traductor.put('9', "9");

        codigoCambiado = codificar(texto, traductor);
        System.out.println(codigoCambiado);

        sc.close();

    }

    public static String codificar(String text, HashMap<Character, String> traductor) {

        char[] aCaracteres = text.toCharArray();
        String codigoHack ="";
        /*
        Convierte una cadena en un array de caracteres.
        String sCadena = "Esto es una cadena de texto";
        char[] aCaracteres = sCadena.toCharArray();

        for (int x = 0; x < aCaracteres.length; x++) {
            System.out.println("[" + x + "] " + aCaracteres[x]);
        }*/

        for (int i = 0; i < aCaracteres.length; i++) {

            //comprobamos que la clave-valor existe sino ponemos solo la clave
            if (traductor.containsKey(aCaracteres[i])) {
                codigoHack += traductor.get(aCaracteres[i]);
            } else {

                codigoHack += aCaracteres[i];
            }

        }
        return codigoHack;

    }

}
