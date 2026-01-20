package PrimerosEjerciciosJava;
import java.util.Scanner;

public class SistemaDeCalificaciones {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la calificación (0-100): ");
        int calificacion = sc.nextInt();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Calificación: A");
        } else if (calificacion >= 80) {
            System.out.println("Calificación: B");
        } else if (calificacion >= 70) {
            System.out.println("Calificación: C");
        } else if (calificacion >= 60) {
            System.out.println("Calificación: D");
        } else if (calificacion >= 0) {
            System.out.println("Calificación: F");
        } else {
            System.out.println("Calificación no válida");
        }

        if (calificacion >= 70) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }

        sc.close();
    }
    
}
