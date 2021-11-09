package VoidMethods;

import java.util.Scanner;

public class MayorDeTres {

    public static void mayor(int value1, int value2, int value3){
        if (value1 > value2 && value1 > value3){
            System.out.println(value1);
        }else if(value2 > value1 && value2 > value3){
            System.out.println(value2);
        }else if(value3 > value1 && value3 > value2){
            System.out.println(value3);
        }
    }

    public static void main(String[] args) {
        int value1;
        int value2;
        int value3;
        Scanner sc = new Scanner(System.in);
        value1 = sc.nextInt();
        value2 = sc.nextInt();
        value3 = sc.nextInt();
        mayor(value1,value2,value3);
    }
}
