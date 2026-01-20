package PrimerosEjerciciosJava;

import java.util.Scanner;

public class PatronesAsterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de líneas: ");
        int filas = sc.nextInt();

        System.out.println("\n--- Patrón Normal ---");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }

        System.out.println("\n--- Patrón Invertido (Bonus) ---");
        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
