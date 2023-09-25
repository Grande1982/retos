
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author cgrande
 */

/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String[] puntuacion = {"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
        //String[] puntuacion = {"P1", "P2", "P2", "P1", "P1", "P2", "P1", "P2", "P2", "P2"};
        
        //probamos a meter mas puntos haber si termina el juego correctamente
        String[] puntuacion = {"P1", "P1", "P1", "P1", "P1","P1", "P1", "P1", "P1", "P1"};
        String contadorP1 = "Love", contadorP2 = "Love";
        boolean finJuego = false;

        for (String punto : puntuacion) {

            if(finJuego != true){
                switch (punto) {
                    case "P1":
                        switch (contadorP1) {
                            case "Love":
                                contadorP1 = "15";
                                System.out.println(contadorP1 + "-" + contadorP2);
                                break;

                            case "15":
                                contadorP1 = "30";
                                System.out.println(contadorP1 + "-" + contadorP2);
                                break;

                            case "30":
                                if (contadorP2.equalsIgnoreCase("40")) {
                                    contadorP1 = "Deuce";
                                    contadorP2 = "Deuce";
                                    System.out.println(contadorP1);

                                } else {
                                    contadorP1 = "40";
                                    System.out.println(contadorP1 + "-" + contadorP2);
                                }
                                break;

                            case "40":
                                System.out.println("Ha ganado el P1");
                                contadorP1 = "Love";
                                contadorP2 = "Love";
                                finJuego = true;
                                break;

                            case "Deuce":

                                contadorP1 = "Ventaja P1";
                                contadorP2 = "desventaja p2";
                                System.out.println(contadorP1);
                                break;

                            case "Ventaja P1":

                                System.out.println("Ha ganado el P1");
                                contadorP1 = "Love";
                                contadorP2 = "Love";
                                finJuego = true;
                                break;

                            case "desventaja p1":

                                contadorP1 = "Deuce";
                                contadorP2 = "Deuce";
                                System.out.println(contadorP1);
                                break;
                        }
                        break;
                    case "P2":
                        switch (contadorP2) {
                            case "Love":
                                contadorP2 = "15";
                                System.out.println(contadorP1 + "-" + contadorP2);
                                break;

                            case "15":
                                contadorP2 = "30";
                                System.out.println(contadorP1 + "-" + contadorP2);
                                break;

                            case "30":
                                if (contadorP1.equalsIgnoreCase("40")) {
                                    contadorP1 = "Deuce";
                                    contadorP2 = "Deuce";
                                    System.out.println(contadorP2);

                                } else {
                                    contadorP2 = "40";
                                    System.out.println(contadorP1 + "-" + contadorP2);
                                }
                                break;

                            case "40":
                                System.out.println("Ha ganado el P2");
                                contadorP1 = "Love";
                                contadorP2 = "Love";
                                finJuego = true;
                                break;

                            case "Deuce":

                                contadorP2 = "Ventaja P2";
                                contadorP1 = "desventaja p1";
                                System.out.println(contadorP2);
                                break;

                            case "Ventaja P2":

                                System.out.println("Ha ganado el P2");
                                contadorP1 = "Love";
                                contadorP2 = "Love";
                                finJuego = true;
                                break;

                            case "desventaja p2":

                                contadorP1 = "Deuce";
                                contadorP2 = "Deuce";
                                System.out.println(contadorP2);
                                break;
                        }
                        break;
                    default:
                        System.out.println("Error al ejecutar el programa");
                        break;

                }
            }

        }

    }

}
