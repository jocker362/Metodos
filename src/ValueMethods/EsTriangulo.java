package ValueMethods;

import java.util.Scanner;

public class EsTriangulo {

    public static boolean formanTriangulo(int x, int y, int z){
        boolean esTriangulo = true;
        int suma = 0;
        if( x > y && x > z){
            suma = y + z;
            if (x > suma ){
                esTriangulo = false;
            }
        }else if( y > x && y > z){
            suma = x + z;
            if (y > suma){
                esTriangulo = false;
            }
        }else if (z > x && z > y){
            suma = x + y;
            if ( z > suma){
                esTriangulo = false;
            }
        }
        return esTriangulo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Introduce la x: ");
        x = sc.nextInt();
        System.out.println("Introduce la y: ");
        y = sc.nextInt();
        System.out.println("Introduce la z: ");
        z = sc.nextInt();
        if(formanTriangulo(x,y,z) == true){
            System.out.println("Se puede formar un triangulo.");
        }else {
            System.out.println("No se puede formar un triangulo.");
        }
    }

}
