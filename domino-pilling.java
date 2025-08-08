import java.util.*;
public class domino_pilling {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int ans = (n / 2 * m) + (n % 2) * (m / 2);
        System.out.print(ans);
    }
} 