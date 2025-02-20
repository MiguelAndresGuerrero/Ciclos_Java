
public class Ejercicio43 {
    public static boolean esNumeroArmstrong(int num) {
        int sum = 0, temp = num, digitos = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digitos);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println("Números de Armstrong entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (esNumeroArmstrong(i)) System.out.println(i);
        }
    }
}
