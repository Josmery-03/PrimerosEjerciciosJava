package PrimerosEjerciciosJava;
import java.util.Scanner;


public class CalculadoraBasica {
    
    public CalculadoraBasica() {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
            System.out.println("Módulo: " + (num1 % num2));
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        sc.close();
    }
    
}
