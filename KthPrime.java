/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    
    static boolean[] generteSieve() {
        int n = 1000000;
        boolean[] sieve = new boolean[n+1];
        for (int i=2; i<=n; i++) sieve[i] = true;
        
        for (int i=2; i*i<=n; i++) {
            if (sieve[i]) {
                for (int j=i*i; j<=n; j+=i) {
                    sieve[j] = false;
                }
            }
        }
        return sieve;
    }
    
    static List<Integer> filterPrimes(boolean[] sieve) {
        List<Integer> primes = new ArrayList<>();
        for (int i=2; i<sieve.length; i++) {
            if(sieve[i]) primes.add(i);
        }
        return primes;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		boolean[] sieve = generteSieve();
		List<Integer> primes = filterPrimes(sieve);
		Scanner scanner = new Scanner(System.in);
		int iterations = scanner.nextInt();
		for(int i=0; i<iterations; i++) {
		    int num = scanner.nextInt();
		    System.out.println(primes.get(num-1));
		}
	}
}
