/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 * @author cgrande
 */

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */


/*
Las tijeras cortan el papel, el papel envuelve la piedra, la piedra aplasta al 
lagarto, el lagarto envenena a Spock, Spock aplasta las tijeras, las tijeras 
decapitan al lagarto, el lagarto devora el papel, el papel desaprueba a Spock, 
Spock desintegra la piedra y, como siempre, la piedra aplasta las tijeras.
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Boolean continuarPartida = false;
        char continuarJugada;
        int golJ1 = 0, golJ2 = 0, resultado = 0;
        int contador = 0;
        int contadorPartida = 0;
        int longitud = 5; // Define la longitud del array
        final String[] jugada = {"piedra", "papel", "tijera", "lagarto", "spock"};
        //int[][] ronda = new int[1][1];
        int jugador1;
        int jugador2;

        System.out.println("Bienvenido al juego piedra, papel, tijera, lagarto, spock");


        do {
            Random random = new Random(); // Crea un objeto de tipo Random
            contador++;
            jugador1 = random.nextInt(jugada.length);
            jugador2 = random.nextInt(jugada.length);
            //int[][] ronda = {{jugador1, jugador2}};//guardamoss cada ronda
            //partida.add(ronda);//guardamos cada conda en la partida total que es el arraylist
            System.out.println("Ronda " + contador);
            System.out.println("-------------------------");
            System.out.println("jugador1: " + jugada[jugador1]);
            System.out.println("jugador2: " + jugada[jugador2]);


            if (jugador1 != jugador2) {

                contadorPartida = arbitro(jugador1, jugador2, golJ1, golJ2, resultado);

            }

            resultado = contadorPartida;
            System.out.println("resultado va: "+resultado);

            System.out.print("Desea relizar otra jugada (y/n): ");
            Scanner sc = new Scanner(System.in);
            continuarJugada = sc.next().charAt(0);

        } while ((continuarJugada == 'y') || (continuarJugada == 'Y'));

        if (resultado > 0) System.out.println("Jugador 1 es el Ganador de la Partida");//gana p1
        if (resultado < 0) System.out.println("Jugador 2 es el Ganador de la Partida");//gana p2
        if (resultado == 0 ) System.out.println("La Partida ha terminado en Empate ");//empate


    }

    public static int arbitro(int j1, int j2, int golJ1, int golJ2, int resultado) {

        //final String[] jugada = {"piedra", "papel", "tijera", "lagarto", "spock"};


        switch (j1) {

            case 0:
                if ((j2 == 2) || (j2 == 3)) {
                    golJ1++;

                    //System.out.println("entra en PIEDRA");
                    System.out.println("Gana J1 la ronda");

                } else {
                    golJ2++;
                    //System.out.println("entra en PIEDRA");
                    System.out.println("Gana J2 la ronda");


                }
                break;
            case 1:
                if ((j2 == 0) || (j2 == 4)) {
                    golJ1++;
                    //System.out.println("entra en PAPEL");
                    System.out.println("Gana J1 la ronda");

                } else {
                    golJ2++;
                    //System.out.println("entra en PAPEL");
                    System.out.println("Gana J2 la ronda");


                }
                break;
            case 2:
                if ((j2 == 1) || (j2 == 3)) {
                    golJ1++;
                    //System.out.println("entra en TIJERA");
                    System.out.println("Gana J1 la ronda");
                } else {
                    golJ2++;
                    //System.out.println("entra en TIJERA");
                    System.out.println("Gana J2 la ronda");

                }
                break;
            case 3:
                if ((j2 == 4) || (j2 == 1)) {
                    golJ1++;
                    //System.out.println("entra en LAGARTO");
                    System.out.println("Gana J1 la ronda");

                } else {
                    golJ2++;
                    //System.out.println("entra en LAGARTO");
                    System.out.println("Gana J2 la ronda");

                }
                break;
            case 4:
                if ((j2 == 0) || (j2 == 2)) {
                    golJ1++;
                    //System.out.println("entra en SPOOK");
                    System.out.println("Gana J1 la ronda");

                } else {
                    golJ2++;
                    //System.out.println("entra en SPOOK");
                    System.out.println("Gana J2 la ronda");


                }
                break;


        }


        resultado = resultado +(golJ1-golJ2);


        return resultado;
    }

    ///
}

