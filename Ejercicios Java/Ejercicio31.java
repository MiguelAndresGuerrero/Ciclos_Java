import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero binario: ");
        String bin = sc.nextLine();
        System.out.println("Decimal " + Integer.parseInt(bin, 2));
    };
};