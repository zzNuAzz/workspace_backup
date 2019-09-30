// Language: Java
import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int score = 0;
        int pre1 = 0;
        int pre2 = 0;

        while(n-- > 0) {
            String inp = in.next();
            if(inp.equals("+")) {
                pre1 = pre1 + pre2;
                pre2 = pre1 - pre2;
                score += pre1;
            }
            else if(inp.euqals("D")) {
                pre2 = pre1;
                pre1 *= 2;
                score += pre1;
            }
            else if(inp.equals("C")) {

            }
        }
    }
}

 