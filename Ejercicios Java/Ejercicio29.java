import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int decimal = sc.nextInt();
        System.out.println("Binario: " + Integer.toBinaryString(decimal));
    };
};