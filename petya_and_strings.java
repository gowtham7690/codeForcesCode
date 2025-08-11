
import java.util.*;
public class petya_and_strings {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char[] c1 = sc.nextLine().toLowerCase().toCharArray();
        char[] c2 = sc.nextLine().toLowerCase().toCharArray();
        for(int i  = 0 ; i < c1.length ; i++)
        {
            if(c1[i] > c2[i]){
                System.out.print("1");
                return;
            }
            else if(c1[i] < c2[i]){
                System.out.print("-1");
                return;
            }
        }
        System.out.print("0");
        
    }
}



