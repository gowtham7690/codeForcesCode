import java.util.*;
public class beautiful_matrix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] dp = new int[5][5];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                dp[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i < 5; i++) 
        {
            for(int j = 0; j < 5; j++)
            {
                if(dp[i][j] == 1)
                {
                    ans += Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(ans);
    }
}