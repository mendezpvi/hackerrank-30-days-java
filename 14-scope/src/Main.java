import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] elements;

        System.out.print("Enter # of elements for the array: ");
        n = sc.nextInt();

        elements = new int[n];

        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt(); // Guarda cada # ingresado
        }

        // Crea una instancia de la clase Difference con el arr leído
        Difference difference = new Difference(elements);

        // Calcula la diferencia máx absoluta entre dos elementos del arr
        difference.computeDifference();

        System.out.println(difference.maximumDifference);

        sc.close();
    }
}

/**
 * Clase Difference que contiene la lógica del reto
 */

class Difference {
    // Variables de instancia (atributos de clase)
    private int[] elements; // Arr privado para almacenar los elementos
    public int maximumDifference;   // Variable pública para guardar la diferencia máxima

    // Constructor: recibe un arr de enteros y lo asigna al atributo de instancia
    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Método que calcula la máxima diferencia absoluta entre dos elementos del array
    public void computeDifference() {
        int max = elements[0];  // Inicializa el máx con el primer elemento
        int min = elements[0];  // Inicializa el mín con el primer elemento

        // Recorre el arr para encontrar el mín y el máx
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) max = elements[i];   // Actualiza el máx si encuentra uno mayor
            if (elements[i] < min) min = elements[i];   // Actualiza el mín si encuentra uno menor
        }

        maximumDifference = Math.abs(max - min);
    }
}
