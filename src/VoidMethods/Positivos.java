package VoidMethods;

import java.util.Scanner;

public class Positivos {
    // <>=
    public static void positivos(int valor) {
        Scanner sc = new Scanner(System.in);
        int positivos[] = new int[10];
        int counter = 0;
        for (int i = 0; i < 10; i++) {

            if (valor >= 0) {
                positivos[i] = valor;
                counter++;
            }
            valor = sc.nextInt();
        }
        System.out.println("Positivos = " + counter);
        for (int k = 0; k < counter; k++) {
            System.out.print(positivos[k]+ ",");
        }
    }

    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
        positivos(valor);
    }
}
