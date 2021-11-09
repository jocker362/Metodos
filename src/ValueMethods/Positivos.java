package ValueMethods;

import java.util.Scanner;

public class Positivos {
    public static int positvos(int arNumeros[] ){
        int x = 0;
        for (int i = 0; i < arNumeros.length; i++){
            if (arNumeros[i] >= 0){
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elementos;
        int numeros;
        System.out.println("Introduce la capacidad del Array:");
        elementos = sc.nextInt();
        int arNumeros[] = new int[elementos];
        for (int k = 0; k < elementos; k++){
            numeros = sc.nextInt();
            arNumeros[k] = numeros;
        }
        System.out.println("Hay "+ positvos(arNumeros) + " positivos.");
    }
}
