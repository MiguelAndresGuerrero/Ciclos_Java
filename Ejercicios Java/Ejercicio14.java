import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Base: ");
        int base = sc.nextInt();

        System.out.println("Exponente: ");
        int expo = sc.nextInt();

        int result = 1;

        for (int i = 0; i < expo; i++) {
            result *= base;
        }

        System.out.println(base + " elevado a " + expo + " es: " + result);
    };
};