
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de terminos: ");
        int n = sc.nextInt();
        int a = 0, b = 1, temp;
        System.out.print("Serie de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        } sc.close();
    };
};
