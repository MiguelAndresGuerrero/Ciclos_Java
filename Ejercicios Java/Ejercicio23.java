import java.util.Scanner;

public class Ejercicio23 {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        return fact;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num6 = sc.nextInt(), suma6 = 0, temp = num6;
        while (temp > 0) {
            suma6 += factorial(temp % 10);
            temp /= 10;
        }
        System.out.println(num6 + (suma6 == num6 ? " es " : " no es") + " un Numero Fuerte");
    };
};