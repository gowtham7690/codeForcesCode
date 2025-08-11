import java.util.Scanner;

public class CapitalizeFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();

        if (Character.isLowerCase(w.charAt(0))) {
            w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
        }

        System.out.println(w);
        sc.close();
    }
}
