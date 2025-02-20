import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>();
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        System.out.println("Ingresa un numero (Escribe 'Salir' para finalizar el programa): ");

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            Lista.add(num);
            if (num > 0) positivo++; 
            else if (num < 0) negativo++;
            else cero++;
        }
        System.out.println("Numeros ingresados: "+ Lista);
        System.out.println("Positivos: " + positivo + " - Negativos: " + negativo + " - Ceros: " + cero);
        
    };
};