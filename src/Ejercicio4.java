import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el vector de números con tamaño 10
        int[] numeros = new int[10];

        System.out.println("--- Registro de números ---");

        // Ciclo para ingresar los números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializamos el mayor y menor con el primer número
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el vector para encontrar mayor y menor
        for (int i = 1; i < numeros.length; i++) {

            // Verificamos el número mayor
            if (numeros[i] > mayor) {

                mayor = numeros[i];
            }

            // Verificamos el número menor
            if (numeros[i] < menor) {

                menor = numeros[i];
            }
        }

        // Mostramos resultados
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        // Cerramos scanner
        scanner.close();
    }
}