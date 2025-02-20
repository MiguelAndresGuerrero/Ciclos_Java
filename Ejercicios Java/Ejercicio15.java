import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero de dos digitos (10): ");
        int num = sc.nextInt();

        int NumInvert = 0;

        for (; num != 0; num /= 10) {
            int digito = num % 10;
            NumInvert = NumInvert * 10 + digito;
        }
        System.out.println("numero invertido: " + NumInvert);
    };
};