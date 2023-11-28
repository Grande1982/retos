

/*
 * Crea un generador de números pseudoaleatorios entre 0 y 100.
 * - No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
 *
 * Es más complicado de lo que parece...
 */


import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        long semillas = System.currentTimeMillis();
        int resultado;

        System.out.println(semillas);
        resultado = (int)semillas/10000000;
        System.out.println(resultado);

        /*Date pseudoAleatorio1 = Date.from(Instant.now());


        pseudoAleatorio1.getSeconds();
        Date pseudoAleatorio2 = Date.from(Instant.now());
        pseudoAleatorio2.getSeconds();

        //System.out.println(pseudoAleatorio1.getSeconds());
        //System.out.println(pseudoAleatorio1.getSeconds());

        float resultado  = pseudoAleatorio1.getSeconds() * pseudoAleatorio2.getSeconds();
        resultado = resultado * 0.1581231313f;

        for (int i= 0; i < 25; i++){
            if (resultado > 100) {
                System.out.println("1-numero aleatorio: "+resultado / 112.3);
            }else {
                System.out.println("2-numero aleatorio: "+resultado / 112.3);
            }
        }*/




    }
}