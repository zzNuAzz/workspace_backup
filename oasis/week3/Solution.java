//import your library
import java.util.*;

public class Solution {
//Type your main code here
    public static void primes(int n) {
        ArrayList<Boolean> Eratosthenes = new ArrayList<>(Collections.nCopies(n+1, true));
        Eratosthenes.set(0, false);
        Eratosthenes.set(1, false);
        for(int i = 2; i <= n; i++) {
            if(Eratosthenes.get(i) == false) continue;
            System.out.print(i +" ");
            if(i > Math.sqrt(Integer.MAX_VALUE)) continue;
            int j = i * i;
            while(j <= n) {
                Eratosthenes.set(j, false);
                j+= i;
            }
        }
    }
    public static void main(String a[]) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primes(n);

    }
}