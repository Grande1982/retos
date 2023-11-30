
/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */

/*
-Un heterograma es una palabra o frase que no contiene ninguna letra repetida
-Un isograma es una palabra o frase en la que cada letra aparece el mismo número de veces.
-Un pangrama es una frase en la que aparecen todas las letras del abecedario.
 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduces una cadena de texto");
        String cadena = sc.nextLine();
        heterograma(cadena);
        isograma(cadena);
        pangrama(cadena);

    }


    public static void heterograma(String cadena) {
        char caracter1, caracter2;
        boolean noHeterograma = false;
        for (int i = 0; i < cadena.length(); i++) {
            caracter1 = cadena.charAt(i);
            System.out.println("cogemos la letra: " + caracter1);

            for (int j = 0; j < cadena.length(); j++) {
                noHeterograma = false;
                if (i != j) {
                    caracter2 = cadena.charAt(j);
                    System.out.println("comparamos la letra: " + caracter1 + " con " + caracter2);
                    if (Character.compare(caracter1, caracter2) == 0) {
                        System.out.println("No es Heterograma");
                        noHeterograma = true;
                        break;
                    }
                }


            }

            if (noHeterograma) break;


        }

    }

    public static void isograma(String cadena) {

    }

    public static void pangrama(String cadena) {

    }
}