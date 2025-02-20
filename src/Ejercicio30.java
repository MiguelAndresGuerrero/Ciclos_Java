
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero Decimal: ");
        String bin = sc.nextLine();
        System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(bin, 2)));
    };
};