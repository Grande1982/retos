
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduces una cadena de texto");
        String cadena = sc.nextLine();
        boolean hem = heterograma(cadena);
        if (hem) {
            System.out.println("No es Heterograma");
        } else {
            System.out.println("Es Heterograma");
        }
        boolean iso = isograma(cadena);

        if (iso) {
            System.out.println("Es isograma");
        } else {
            System.out.println("No es isograma");
        }

        boolean pant = pangrama(cadena);

        if (pant) {
            System.out.println("Es Pangrama");
        } else {
            System.out.println("No es Pangrama");
        }


    }


    public static boolean heterograma(String cadena) {
        char caracter1, caracter2;
        boolean noHeterograma = false;
        for (int i = 0; i < cadena.length(); i++) {
            caracter1 = cadena.charAt(i);
            //System.out.println("cogemos la letra: " + caracter1);

            for (int j = 0; j < cadena.length(); j++) {
                noHeterograma = false;
                if (i != j) {
                    caracter2 = cadena.charAt(j);
                    //System.out.println("comparamos la letra: " + caracter1 + " con " + caracter2);
                    if (Character.compare(caracter1, caracter2) == 0) {

                        noHeterograma = true;
                        break;
                    }
                }


            }

            if (noHeterograma) break;


        }

        return noHeterograma;

    }

    public static boolean isograma(String cadena) {

        ArrayList<Character> contenedorLetras = new ArrayList<Character>();
        char caracter1, caracter2;
        int contadorInicio = 0, contadorFinal = 0;
        HashMap<Character, Integer> contadorTotal = new HashMap<Character, Integer>();

        for (int i = 0; i < cadena.length(); i++) {
            caracter1 = cadena.charAt(i);
            //System.out.println("cogemos la letra: " + caracter1);
            contenedorLetras.add(caracter1);
        }

        for (int j = 0; j < contenedorLetras.size(); j++) {
            caracter1 = contenedorLetras.get(j);


            for (int k = 0; k < contenedorLetras.size(); k++) {
                caracter2 = contenedorLetras.get(k);
                if (Character.compare(caracter1, caracter2) == 0) {

                    contadorFinal++;
                }

            }
            contadorTotal.put(caracter1, contadorFinal);
            contadorInicio = contadorFinal;
            contadorFinal = 0;

        }


        boolean eso = false;
        // Obtener las claves y valores utilizando un bucle for-each y el método entrySet()
        for (Map.Entry<Character, Integer> entry : contadorTotal.entrySet()) {

            Character clave = entry.getKey();
            Integer valor = entry.getValue();
            //System.out.println("Clave: " + clave + ", Valor: " + valor);
            if (contadorInicio != valor) {
                eso = false;
            } else {
                eso = true;
            }
        }


        //System.out.println(contadorTotal);
        return eso;


    }

    public static boolean pangrama(String cadena) {

        int contadorInicio = 0, contadorFinal = 0;
        ArrayList<Character> contenedorLetras = new ArrayList<Character>();
        char[] abecedario = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        char caracter1, caracter2;
        for (int i = 0; i < cadena.length(); i++) {
            caracter1 = cadena.charAt(i);
            //System.out.println("cogemos la letra: " + caracter1);
            contenedorLetras.add(caracter1);
        }

        Map<Character, Integer> contadorCV = new HashMap<>();
        int valor=0;
        for (int j = 0; j < contenedorLetras.size(); j++) {
            caracter1 = contenedorLetras.get(j);

            for (int k = 0; k < abecedario.length; k++) {
                caracter2 = abecedario[k];
                //System.out.println( "letra "+caracter1+ " compara "+caracter2);
                if (Character.compare(caracter1, caracter2) == 0) {
                    valor = 1;
                    contadorCV.put(caracter1, valor);
                }

            }



        }
        //System.out.println("contadorCV " + contadorCV.size());
        //System.out.println("valores " + contadorCV.values());

        if (contadorCV.size() == 27) {
            return true;
        } else {
            return false;
        }
    }


}
