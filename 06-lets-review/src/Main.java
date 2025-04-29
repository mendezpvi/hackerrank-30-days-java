import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter # of test: ");
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                if (j % 2 == 0) {
                    even.append(word.charAt(j));
                } else {
                    odd.append(word.charAt(j));
                }
            }

            System.out.println(even + " " + odd);
        }


        sc.close();
    }
}