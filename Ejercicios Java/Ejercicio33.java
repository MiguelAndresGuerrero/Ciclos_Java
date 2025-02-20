import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero octal: ");
        String ocatal = sc.nextLine();
        System.out.println("Binario: " + Integer.toHexString(Integer.parseInt(ocatal,8)));
    };
};