
import java.util.HashMap;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 /*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
/**
 *
 * @author cgrande
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        HashMap<Integer, Character> traductor = new HashMap<>();

        traductor.put(1, 'a');
        traductor.put(2, 'b');
        traductor.put(3, 'c');
        traductor.put(4, 'd');
        traductor.put(5, 'e');
        traductor.put(6, 'f');
        traductor.put(7, '€');
        traductor.put(8, 'g');
        traductor.put(9, 'h');
        traductor.put(10, 'i');
        traductor.put(11, 'j');
        traductor.put(12, 'k');
        traductor.put(13, 'l');
        traductor.put(14, 'm');
        traductor.put(15, 'n');
        traductor.put(16, 'o');
        traductor.put(17, 'p');
        traductor.put(18, 'q');
        traductor.put(19, 'r');
        traductor.put(20, 's');
        traductor.put(21, 't');
        traductor.put(22, 'u');
        traductor.put(23, 'v');
        traductor.put(24, 'w');
        traductor.put(25, 'x');
        traductor.put(26, 'y');
        traductor.put(27, 'z');

        //mayusculas seria igual pero añaiendo mas key para simplicar solo voy a poner numeros
        traductor.put(28, '0');
        traductor.put(29, '1');
        traductor.put(30, '2');
        traductor.put(31, '3');
        traductor.put(32, '4');
        traductor.put(33, '5');
        traductor.put(34, '6');
        traductor.put(35, '7');
        traductor.put(36, '8');
        traductor.put(37, '9');

        int intlongitud = 0;
        int codigo = 0;

        //habria que generar una lists para que elegiera el los caracteres de esa lista
        //list(range(97, 123));
        do {

            Random longitud = new Random(System.currentTimeMillis());
            intlongitud = longitud.nextInt(16) + 8;

            //intlongitud = (int) (Math.random() * 16);
        } while ((intlongitud < 8) || (intlongitud > 16));

        System.out.println("longitud de la contraseña sera de : " + intlongitud);

        String pwd = "";

        for (int i = 0; i < intlongitud; i++) {

            //habria que optimizar este aleatorio para que solo cogeria el rango elegido. no se como se hace
            do {

                //Random letra = new Random(System.currentTimeMillis());
                //codigo = letra.nextInt(37)+1 ;
                codigo = (int) (Math.random() * 37);

            } while ((codigo < 1) || (codigo > 37));

            pwd += traductor.get(codigo);

        }

        System.out.println("la contraseña es: " + pwd);

    }

}
