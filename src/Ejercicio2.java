
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if (Num >= 1) {
            for (int i = Num; i >= 1; i--) {
                System.out.println("Numero: " + i);
            }
        } else {
            System.out.println("Ingresa un numero mayor a 1");
        }
    };
};