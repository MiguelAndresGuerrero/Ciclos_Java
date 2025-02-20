
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero octal: ");
        String octa = sc.nextLine();
        System.out.println("Decimal: " + Integer.parseInt(octa,8));
    };
};