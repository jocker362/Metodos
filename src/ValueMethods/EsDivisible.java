package ValueMethods;

import java.util.Scanner;

public class EsDivisible {
    public static boolean divisible(int n, int m){
        double valor = 0;
        valor = n / m;
        if( valor == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        divisible(n,m);
        if (divisible(n,m) == true){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }
    }
}
