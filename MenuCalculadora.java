package PrimerosEjerciciosJava;

import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa primer número: ");
                double n1 = sc.nextDouble();
                System.out.print("Ingresa segundo número: ");
                double n2 = sc.nextDouble();

                switch (opcion) {
                    case 1: System.out.println("Resultado: " + (n1 + n2)); break;
                    case 2: System.out.println("Resultado: " + (n1 - n2)); break;
                    case 3: System.out.println("Resultado: " + (n1 * n2)); break;
                    case 4: 
                        if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                        else System.out.println("Error: División por cero.");
                        break;
                }
            }
        } while (opcion != 5);

        System.out.println("Programa terminado.");
        sc.close();
    }
}
    

