
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int complemento = ~num;
        System.out.println("Complemento a 1: " + complemento);
        sc.close();
    };
};
