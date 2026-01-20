package PrimerosEjerciciosJava;

public class CastingYConversiones {

    public static void main(String[] args) {

        int entero = 10;
        double decimal = entero; // Conversión implícita

        System.out.println("Entero: " + entero);
        System.out.println("Decimal (implícita): " + decimal);

        double d = 9.7;
        int i = (int) d; // Conversión explícita (casting)

        System.out.println("Double: " + d);
        System.out.println("Int (explícita): " + i);
    }
}


