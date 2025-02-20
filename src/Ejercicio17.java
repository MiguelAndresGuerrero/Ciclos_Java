
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean Primo = true;

        if (num <= 1) {
            Primo = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    Primo = false;
                    break;
                };
            };
        };

        if (Primo) {
            System.out.println(num + " Es primo");
        } else {
            System.out.println(num + "No es primo");
        };
    };
};