import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero octal: ");
        String octal = sc.nextLine();
        System.out.println("Hexadecimal: " + Integer.toHexString(Integer.parseInt(octal,8)));
    };
};