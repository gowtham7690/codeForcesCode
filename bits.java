import java.util.*;
public class bits{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
        {
            char[] ch = sc.next().toCharArray();
            ans += ch[1] == '+' ? 1 : -1;
        }
        System.out.print(ans);
    }
}