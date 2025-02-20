
public class Ejercicio41 {
    public static boolean esNumeroPerfecto(int num) {
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println("Números Perfectos del 1 al 10000:");
        for (int i = 2; i <= 10000; i++) {
            if (esNumeroPerfecto(i)) System.out.println(i);
        }
    }
}
