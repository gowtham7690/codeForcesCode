
import java.util.*;
public class helpful_maths{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\+");
        Arrays.sort(words);
        System.out.println(String.join("+", words));
    }
}

