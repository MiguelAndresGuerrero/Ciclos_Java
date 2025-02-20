import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero binario: ");
            int binario = sc.nextInt();
            int decimal = 0, potencia = 1;
            for (; binario > 0; binario /= 10) {
                decimal += (binario % 10) * potencia;
                potencia *= 2;
            }
            System.out.println("Numero decimal: " + decimal);
    };
};