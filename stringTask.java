import java.util.*;
public class stringTask{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        String s = sc.nextLine();
        for (char i : s.toCharArray()){
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A'|| i == 'E' || i == 'I' || i == 'O' || i == 'U')
                continue;
            else{
                ans.append(".");
                if (Character.isUpperCase(i))
                    ans.append(i + 32);
                else
                    ans.append(i);
            }
        }
        System.out.print(new String(ans));
    }
}