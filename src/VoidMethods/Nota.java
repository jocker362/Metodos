package VoidMethods;

import java.util.Scanner;

public class Nota {
    public static void evaluacion(int nota){
        if( nota <= 3){
            System.out.println("Muy Deficiente.");
        }else if(nota <5){
            System.out.println("Insuficiente");
        }else if(nota <= 7){
            System.out.println("Bien");
        }else if(nota < 9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");
        }
    }

    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        nota = sc.nextInt();
        evaluacion(nota);
    }
}
