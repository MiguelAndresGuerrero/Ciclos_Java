import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==========================");
            System.out.println("    MENU DE EJERCICIOS    ");
            System.out.println("==========================");
            System.out.println("1 - Ejecutar Ejercicio1");
            System.out.println("2 - Ejecutar Ejercicio2");
            System.out.println("3 - Ejecutar Ejercicio3");
            System.out.println("4 - Ejecutar Ejercicio4");
            System.out.println("5 - Ejecutar Ejercicio5");
            System.out.println("6 - Ejecutar Ejercicio6");
            System.out.println("7 - Ejecutar Ejercicio7");
            System.out.println("8 - Ejecutar Ejercicio8");
            System.out.println("9 - Ejecutar Ejercicio9");
            System.out.println("10 - Ejecutar Ejercicio10");
            System.out.println("11 - Ejecutar Ejercicio11");
            System.out.println("12 - Ejecutar Ejercicio12");
            System.out.println("13 - Ejecutar Ejercicio13");
            System.out.println("14 - Ejecutar Ejercicio14");
            System.out.println("15 - Ejecutar Ejercicio15");
            System.out.println("16 - Ejecutar Ejercicio16");
            System.out.println("17 - Ejecutar Ejercicio17");
            System.out.println("18 - Ejecutar Ejercicio18");
            System.out.println("19 - Ejecutar Ejercicio19");
            System.out.println("20 - Ejecutar Ejercicio20");
            System.out.println("0 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: Ejercicio1.main(null); break;
                case 2: Ejercicio2.main(null); break;
                case 3: Ejercicio3.main(null); break;
                case 4: Ejercicio4.main(null); break;
                case 5: Ejercicio5.main(null); break;
                case 6: Ejercicio6.main(null); break;
                case 7: Ejercicio7.main(null); break;
                case 8: Ejercicio8.main(null); break;
                case 9: Ejercicio9.main(null); break;
                case 10: Ejercicio10.main(null); break;
                case 11: Ejercicio11.main(null); break;
                case 12: Ejercicio12.main(null); break;
                case 13: Ejercicio13.main(null); break;
                case 14: Ejercicio14.main(null); break;
                case 15: Ejercicio15.main(null); break;
                case 16: Ejercicio16.main(null); break;
                case 17: Ejercicio17.main(null); break;
                case 18: Ejercicio18.main(null); break;
                case 19: Ejercicio19.main(null); break;
                case 20: Ejercicio20.main(null); break;
                case 0: System.out.println("Saliendo, Vuelve pronto :D"); break;
                default: System.out.println("Ingresa una de las opciones no sea pendejo >:v");
            }
        } while (opcion != 0);

        sc.close();
    };
};