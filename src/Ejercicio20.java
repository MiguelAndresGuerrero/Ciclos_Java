
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer maximo = null;
        Integer minimo = null;

        System.out.println("Ingresa un numero (Escribe 'Salir' para finalizar el programa): ");

        while (true) {
            String entrada = sc.next();
            if (entrada.equalsIgnoreCase("salir")) break; 

            try {
                int num = Integer.parseInt(entrada);
                if (minimo == null || num < minimo) minimo = num; 
                if (maximo == null || num > maximo) maximo = num;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero o la palabra salir");
            }
        }
        if (minimo != null && maximo != null) {
            System.out.println("Numero mas grande: " + maximo);
            System.out.println("Numero mas pequeño: " + minimo);
        } else {
            System.out.println("No se ingreso ningun numero");
        }
    };
};