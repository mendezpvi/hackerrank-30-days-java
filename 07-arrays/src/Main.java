import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] copy = new int[A.length];

        // Solución más óptima
        for (int i = A.length - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
        System.out.println("\n###################");

        // Agregamos a un array: copy
        for (int i = 0; i < A.length; i++) {
            int j = A.length - i - 1;
            copy[j] = A[i];
        }

        A = copy;

        for (int num : A) {
            System.out.print(num + " ");
        }


    }
}
