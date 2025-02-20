
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = "";

        System.out.print("Ingrese un número hexadecimal: ");
        hex = sc.nextLine();
        System.out.println("Octal: " + Integer.toOctalString(Integer.parseInt(hex, 16)));
    };
};