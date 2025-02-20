
import java.util.Scanner;

public class Ejercicio39 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    };
    public static boolean esNumeroFuerte(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println(num + (esNumeroFuerte(num) ? " es" : " no es") + " un Numero Fuerte");
        sc.close();
    };
};
