import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        int num = sc.nextInt();
        double dob = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(i + num);
        System.out.println(d + dob);
        System.out.println(s + " " + str);

        sc.close();
    }
}
