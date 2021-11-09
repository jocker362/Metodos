package ValueMethods;

import java.util.Scanner;

public class Primo {
    // <>=
    public static boolean esPrimo(int numero){
    int mitad;
    boolean primo = true ;
    mitad = numero / 2;
        if(numero == 2 || numero == 3){

    }else {
        for (int i = 3; i <= mitad; i++) {
            if (numero % i == 0) {
                primo = false;

                break;
            }
        }
    }

        return  primo;
}

    public static void main(String[] args) {
        int numero;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = keyboard.nextInt();
        if ( esPrimo(numero)==true){
            System.out.println("Es un numero primo.");
        }else {
            System.out.println("No es primo");
        }
    }
}
