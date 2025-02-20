
public class Ejercicio40 {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    };
    public static boolean esNumeroFuerte(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    };
    public static void main(String[] args) {
        System.out.println("Números Fuertes del 1 al 100000:");
        for (int i = 1; i <= 100000; i++) {
            if (esNumeroFuerte(i)) System.out.println(i);
        }
    };
};
