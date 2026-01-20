package PrimerosEjerciciosJava;


import java.util.Scanner;

public class DetectorPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número para verificar si es primo: ");
        int n = sc.nextInt();
        
        boolean esPrimo = true; // Suponemos que es primo hasta demostrar lo contrario

        if (n <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false; // Encontramos un divisor, ya no es primo
                    break; // Salimos del bucle para ahorrar tiempo
                }
            }
        }

        if (esPrimo) {
            System.out.println(n + " es un número primo.");
        } else {
            System.out.println(n + " NO es un número primo.");
        }
        sc.close();
    }
}

