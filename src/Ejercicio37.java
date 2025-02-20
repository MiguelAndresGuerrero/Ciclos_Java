
import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        int complemento = ~num + 1;
        System.out.println("Complemento a 2: " + complemento);
        sc.close();
    };
};
