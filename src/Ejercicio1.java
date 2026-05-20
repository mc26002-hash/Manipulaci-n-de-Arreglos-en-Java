import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el vector de frutas con tamaño 10
        String[] frutas = new String[10];

        System.out.println("--- Registro de frutas ---");

        // Ciclo para ingresar las frutas
        for (int i = 0; i < frutas.length; i++) {

            System.out.print("Ingrese la fruta #" + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostramos las frutas en orden inverso
        System.out.println("\n--- Frutas en orden inverso ---");

        for (int i = frutas.length - 1; i >= 0; i--) {

            System.out.println(frutas[i]);
        }

        // Cerramos scanner
        scanner.close();
    }
}