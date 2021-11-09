package VoidMethods;

import java.util.Scanner;

public class Mayor {
    // <>=
    public static void mayorDeEdad(int edad){
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }

    public static void main(String[] args) {
     int edad;
     Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una edad: ");
     edad = sc.nextInt();
     mayorDeEdad(edad);
    }
}
