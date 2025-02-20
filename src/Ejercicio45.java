
import java.util.Scanner;

public class Ejercicio45{
    public static void imprimirFactoresPrimos(int num) {
        System.out.print("Factores primos de " + num + ": ");
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 2) System.out.print(num);
        System.out.println();
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        imprimirFactoresPrimos(num);
        sc.close();
    };
};
