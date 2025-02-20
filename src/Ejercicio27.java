
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        Long decimal1 = sc.nextLong();
        System.out.println("Hexadecimal: " + Long.toHexString(decimal1));
    };
};