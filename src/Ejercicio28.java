
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = 0;
        System.out.print("Ingrese un número decimal: ");
        decimal = sc.nextInt();
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    };
};