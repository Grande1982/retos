
/*
 * Crea un programa que simule el comportamiento del sombrero seleccionador del
 * universo mágico de Harry Potter.
 * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
 * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
 * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
 *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
 * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
 *   Por ejemplo, en Slytherin se premia la ambición y la astucia.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int gryffindor;
    static int slytherin;
    static int ravenclaw;
    static int hufflepuff;

    public static <gryffindor, slytherin, ravenclaw, hufflepuff> void main(String[] args) {

        //Gryffindor, Slytherin , Hufflepuff y Ravenclaw
        int numPregunta = 0;


        do {

            System.out.println("Elije un color");
            System.out.println("1- Dorado");
            System.out.println("2- Verde");
            System.out.println("3- Azul");
            System.out.println("4- Amarillo");
            System.out.print("Responde 1, 2, 3 o 4: ");
            Scanner sc = new Scanner(System.in);
            numPregunta = sc.nextInt();

        } while ((numPregunta < 1) || (numPregunta > 4));

        contador(numPregunta);

        numPregunta = 0;

        do {

            System.out.println("Elije un elemento");
            System.out.println("1- Fuego");
            System.out.println("2- Tierra");
            System.out.println("3- Aire");
            System.out.println("4- Agua");
            System.out.print("Responde 1, 2, 3 o 4: ");
            Scanner sc = new Scanner(System.in);
            numPregunta = sc.nextInt();

        } while ((numPregunta < 1) || (numPregunta > 4));

        contador(numPregunta);

        numPregunta = 0;

        do {

            System.out.println("Elije un Animal");
            System.out.println("1- Leon");
            System.out.println("2- Aguila");
            System.out.println("3- Serpiente");
            System.out.println("4- Dragon");
            System.out.print("Responde 1, 2, 3 o 4: ");
            Scanner sc = new Scanner(System.in);
            numPregunta = sc.nextInt();

        } while ((numPregunta < 1) || (numPregunta > 4));
        contador(numPregunta);

        numPregunta = 0;
        do {

            System.out.println("Elije un estacion");
            System.out.println("1- verano");
            System.out.println("2- primavera");
            System.out.println("3- otoño");
            System.out.println("4- invierno");
            System.out.print("Responde 1, 2, 3 o 4: ");
            Scanner sc = new Scanner(System.in);
            numPregunta = sc.nextInt();

        } while ((numPregunta < 1) || (numPregunta > 4));
        contador(numPregunta);

        int[] mayor=new int[4];
        int posicionMayor = 0;

        mayor[0] = gryffindor;
        mayor[1] = slytherin;
        mayor[2] = ravenclaw;
        mayor[3] = hufflepuff;

        for (int i= 0; i< mayor.length; i++){

            // si hay empate me quedo con la primera de las casas
            if (mayor[i] > mayor[posicionMayor]){

                posicionMayor = i;

            }
        }
        switch (posicionMayor) {
            case 0:
                System.out.println("Casa Gryffindor");
                break;
            case 1:
                System.out.println("Casa Slytherin");
                break;
            case 2:
                System.out.println("Casa Ravenclaw");
                break;
            case 3:
                System.out.println("Casa Hufflepuff");
                break;
            default:
                break;
        }


    }

    public static void contador(int numPregunta) {

        switch (numPregunta) {
            case 1:
                gryffindor++;
                break;
            case 2:
                slytherin++;
                break;
            case 3:
                ravenclaw++;
                break;
            case 4:
                hufflepuff++;
                break;
            default:
                break;
        }
        /*
        System.out.println("gryffindor "+gryffindor);
        System.out.println("slytherin "+slytherin);
        System.out.println("ravenclaw "+ravenclaw);
        System.out.println("hufflepuff "+hufflepuff);*/
    }

}