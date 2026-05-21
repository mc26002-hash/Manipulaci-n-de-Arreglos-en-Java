import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4]; // Matriz de 3 filas y 4 columnas (12 elementos)


        System.out.println("Introduce 12 valores numéricos para la matriz (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\n--- MATRIZ INTRODUCIDA ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n--- BUSCANDO PUNTO DE SILLA ---");
        boolean encontrado = false;


        for (int i = 0; i < 3; i++) {

            int minFila = matriz[i][0];
            int colMin = 0;

            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }


            boolean esPuntoSilla = true;
            for (int k = 0; k < 3; k++) {
                if (matriz[k][colMin] > minFila) {
                    esPuntoSilla = false;
                    break;
                }
            }


            if (esPuntoSilla) {
                System.out.println("¡Punto de silla encontrado!");
                System.out.println("El número es: " + minFila + " en la posición Fila " + i + ", Columna " + colMin);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún punto de silla en esta matriz.");
        }
    }
}
