import java.util.Scanner;

public class Tablero {

    public int[][] crearTablero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (n): ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        scanner.close(); 

        return matriz;
    }
}
