/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cgrande
 */

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean resultado3 = false;
        boolean resultado5 = false;

        for (int i = 0; i < 101; i++) {
            resultado3 = false;
            resultado5 = false;

            if (i % 3 == 0) {
                resultado3 = true;
            }
            if (i % 5 == 0) {
                resultado5 = true;
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.println("Numero: " + i);
            }

            if (resultado3 && resultado5) {
                System.out.println("fizzbuzz");
            }
            if (resultado3 && !(resultado5)) {
                System.out.println("fizz");
            }
            if (resultado5 && !(resultado3)) {
                System.out.println("buzz");
            }
        }
    }

}
