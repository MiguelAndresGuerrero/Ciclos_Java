import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int num  = sc.nextInt();
        int suma = 0;

        for (;num > 0; num /= 10) {
            suma += num %10;
        }

        System.out.println(suma);
    };
};