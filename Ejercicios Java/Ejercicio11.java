import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= num; i += 2) {
            result += i;
        }
        System.out.println(result);
    };
};