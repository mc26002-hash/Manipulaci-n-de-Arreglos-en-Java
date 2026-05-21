import java.util.Scanner;

public class ArticulosInvertidos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] articulos = new String[3][3];

        // Ingresar artículos
        System.out.println("Ingrese 9 nombres de artículos:");

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print("Artículo [" + fila + "][" + columna + "]: ");
                articulos[fila][columna] = sc.nextLine();
            }
        }

        // Mostrar matriz con filas invertidas
        System.out.println("\nMatriz con filas invertidas:");

        for (int fila = 2; fila >= 0; fila--) {
            for (int columna = 0; columna < 3; columna++) {

                System.out.print(articulos[fila][columna] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
