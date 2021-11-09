package VoidMethods;

import java.util.Scanner;

public class Descendente {

    public static void ordenDescendente(int valor1, int valor2){
        if (valor1 == valor2){
            System.out.println("Los valores son iguales.");
        }else {

            if (valor1 > valor2) {
                System.out.println(valor2 + "," + valor1);
            } else {
                System.out.println(valor1 + "," + valor2);
            }
        }
    }

    public static void main(String[] args) {
        int valor1;
        int valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor1: ");
        valor1 = sc.nextInt();
        System.out.println("Introduce el valor2: ");
        valor2 = sc.nextInt();
        ordenDescendente(valor1 ,valor2);
    }
}
