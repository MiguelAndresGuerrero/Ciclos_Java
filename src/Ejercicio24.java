
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número hexadecimal: ");
        String hex = sc.nextLine();
        System.out.println("Decimal: " + Integer.parseInt(hex, 16));
    };
};