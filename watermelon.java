package codeForces;
import java.util.*;
public class watermelon{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0 && n > 2)
        {
            System.out.print("YES");
        }
        else 
            System.out.print("NO");
    }
}