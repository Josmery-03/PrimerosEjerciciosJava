package PrimerosEjerciciosJava;
import java.util.Scanner;
public class AreaDeCirculo {
  
    public static void main(String[] args) {

        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = PI * radio * radio;
        double perimetro = 2 * PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);

        sc.close();
    }
}


