
import java.util.Scanner;

public class Ejercicio44 {
    public static boolean esNumeroArmstrong(int num) {
        int sum = 0, temp = num, digitos = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digitos);
            temp /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        System.out.println(num + (esNumeroArmstrong(num) ? " es" : " no es") + " un Numero de Armstrong");
        sc.close();
    };
};