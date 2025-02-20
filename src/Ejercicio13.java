
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        long facto = 1;

        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        System.out.println( num + " - " + facto);
    };
};