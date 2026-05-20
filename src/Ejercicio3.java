import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el vector de números con tamaño 12
        int[] numeros = new int[12];

        // Variables para contar pares e impares
        int pares = 0;
        int impares = 0;

        System.out.println("--- Registro de números enteros ---");

        // Ciclo para ingresar los números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificamos si el número es par o impar
            if (numeros[i] % 2 == 0) {

                pares++;

            } else {

                impares++;
            }
        }

        // Mostramos resultados
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        // Cerramos scanner
        scanner.close();
    }
}