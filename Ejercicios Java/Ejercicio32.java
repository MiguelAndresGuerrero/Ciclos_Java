import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero binario: ");
        String bin = sc.nextLine();
        System.out.println("Hexadecimal: " + Integer.toString(Integer.parseInt(bin,2)));
    };
};