
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
        } else {
            System.out.println("Ingresa un numero mayor a 1");
        }
    };
};