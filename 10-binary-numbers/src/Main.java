import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Convertir a binario. Usamos toBinaryString de la clase Integer
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);

        // Separar por ceros
        String[] groups = binary.split("0");

        // Almacenará la longitud del grupo más largo de 1's
        int maxCount = 0;

        // Recorre los grupos de 1's
        for (String group : groups) {
            if (group.length() > maxCount) {
                maxCount = group.length();
            }
        }

        System.out.println(maxCount);

        /**/
        System.out.println("########################");
        System.out.print("Enter another number: ");
        int otherN = sc.nextInt();
        sc.nextLine();

        String anotherBinary = Integer.toBinaryString(otherN);

        // Inicializar los contadores
        int anotherMaxCount = 0;    // Almacenará el # máx 1's
        int currentCount = 0;       // Contará los 1's consecutivos

        // Recorrer el binario
        for (int i = 0; i < anotherBinary.length(); i++) {
            if (anotherBinary.charAt(i) == '1') {  // Verifica si el caracter de la posición i es un 1
                currentCount++;     // Suma si es '1'
                if (currentCount > anotherMaxCount) {
                    anotherMaxCount = currentCount; // Actualiza si es el máximo
                }
            } else {    // Si el caracter de la posición i es un 0
                currentCount = 0;   // Reinicia el contador de 1's consecutivos
            }
        }

        System.out.println("Another binary: " + anotherMaxCount);

        sc.close();
    }
}
