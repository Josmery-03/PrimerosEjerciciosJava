package PrimerosEjerciciosJava;

import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿De qué número deseas la tabla?: ");
        int numero = sc.nextInt();
        
        System.out.println("Tabla del " + numero + ":");
        // (inicio; condición; incremento)
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        sc.close();
    }
}
