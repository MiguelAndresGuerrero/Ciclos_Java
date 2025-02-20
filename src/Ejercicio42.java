
import java.util.Scanner;

public class Ejercicio42 {
    public static boolean esNumeroPerfecto(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println(num + (esNumeroPerfecto(num) ? " es" : " no es") + " un Número Perfecto.");
        sc.close();
    }
}
