import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal1 = sc.nextInt();
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal1));
    };
};