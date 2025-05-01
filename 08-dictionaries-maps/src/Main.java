import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        /*phoneBook.put("sam", 99912222);
        phoneBook.put("tom", 11122222);
        phoneBook.put("harry", 12299933);*/

        // Número de entradas
        int n = sc.nextInt();
        sc.nextLine();

        // Guarda las entradas en el map
        for (int i = 0; i < n; i++) {
            String entry = sc.nextLine();
            String[] parts = entry.split(" ");
            String name = parts[0];
            String phone = parts[1];
            phoneBook.put(name, phone);
        }

        // Tamaño del map
        // System.out.println(phoneBook.size()); //->  3

        // Procesar consultas hasta fin de entrada
        while (sc.hasNext()) {
            String query = sc.nextLine();

            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
