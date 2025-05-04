import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se declara e inicializa una matrix 6x6 de enteros
        int[][] arr = new int[6][6];

        // Se llenan las 6 row y 6 col con valores ingresados desde la consola
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();   // Se lee un entero y se guarda en la posición [i][j]
            }
        }

        // Se inicializa la variable para almacenar la suma máxima encontrada
        int maxSum = Integer.MIN_VALUE; // Se parte del valor más bajo posible

        // Recorrer todas las posiciones válidas que forman un reloj de arena
        // Un reloj de arena requiere 3 row y 3 col, por eso se limita hasta i, j < 4
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Se calcula la suma de los 7 elementos que forman un reloj de arena
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                                    + arr[i+1][j+1]+
                          arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                // Se actualiza la suma máxima si se encuentra una mayor
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);

        /**/
        System.out.println("########################");
        List<List<Integer>> arr2 = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                row.add(sc.nextInt());
            }
            arr2.add(row);
        }

        int maxSum2 = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int top = arr2.get(i).get(j) + arr2.get(i).get(j+1) + arr2.get(i).get(j+2);
                int middle = arr2.get(i+1).get(j+1);
                int bottom = arr2.get(i+2).get(j) + arr2.get(i+2).get(j+1) + arr2.get(i+2).get(j+2);
                int sum =  top + middle + bottom;

                if (sum > maxSum2) {
                    maxSum2 = sum;
                }
            }
        }

        System.out.println("Segunda matrix: " + maxSum2);

        sc.close();
    }
}
