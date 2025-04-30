import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hello, World.";

        System.out.print("Enter a sentence: ");
        String inputString = sc.nextLine();

        System.out.println(text + "\n" + inputString);
        sc.close();
    }
}
