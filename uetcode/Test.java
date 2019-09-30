import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern s = Pattern.compile("ab");
        while (!sc.hasNext(s))
        {
            String a = sc.nextLine();
            System.out.printf("a \n");
            if (a == "\n")
            {
                dem++;
                System.out.printf(dem + " ");
            }
        }
    }
}