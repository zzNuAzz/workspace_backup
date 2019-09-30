import java.util.*;
public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
    	while(b != 0) {
    		int r = a % b;
    		a = b;
    		b = r;
    	}
    	return a;
        // return;
    }

    // compute the fibonacci of $n
    public long fibonacci(int n) {
    	if(n == 0 || n == 1) return 1;
    	long pre1 = 1;
    	long pre2 = 1;
    	long fib = 0;
    	for(int i = 1; i < n; i++) {
    		fib = pre1 + pre2;
    		pre2 = pre1;
    		pre1 = fib;
    	}
    	return fib;
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {
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
}
