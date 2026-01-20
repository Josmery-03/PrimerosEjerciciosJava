package PrimerosEjerciciosJava;

import java.util.Scanner;
public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Grados Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9/5) + 32;
            System.out.println(c + "°C equivale a " + f + "°F");
        } else if (opcion == 2) {
            System.out.print("Grados Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5/9;
            System.out.println(f + "°F equivale a " + c + "°C");
        } else {
            System.out.println("Opción no válida.");
        }
        
        sc.close();
    }
}
