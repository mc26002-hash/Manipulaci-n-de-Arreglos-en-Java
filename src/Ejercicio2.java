import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el vector de números con tamaño 12
        int[] numeros = new int[12];

        // Variable para almacenar la suma
        int suma = 0;

        System.out.println("--- Registro de números enteros ---");

        // Ciclo para ingresar los números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Sumamos cada número ingresado
            suma = suma + numeros[i];
        }

        // Calculamos el promedio
        double promedio = (double) suma / numeros.length;

        // Mostramos el promedio
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        // Cerramos scanner
        scanner.close();
    }
}