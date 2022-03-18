import java.util.*;
public class WM{
    public static Boolean Watermelon(){
        Scanner in = new Scanner(System.in);
        int x;
        x=in.nextInt();
        if (x > 2 && x % 2 == 0){
            System.out.println("YES");
            return true;
        }
        else
            System.out.println("NO");
        return false;
    }
}