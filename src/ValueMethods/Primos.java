package ValueMethods;

public class Primos {
    public static void main(String[] args) {
        int numero;
        for(int i = 3; i <= 100; i++ ) {
            if(Primo.esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
