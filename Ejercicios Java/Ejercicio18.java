import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();

        int mcd = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
        }
        System.out.println("El Mcd de " + num1 + " y " + num2 + " = " + mcd);
    };
};