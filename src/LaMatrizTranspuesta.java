
import java.util.Scanner;

public class LaMatrizTranspuesta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        System.out.println("Ingrese 9 números:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print("Número [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = sc.nextInt();
            }
        }


        System.out.println("\nMatriz original:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatriz transpuesta:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print(matriz[columna][fila] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
