package BasicMathematics;
/* https://leetcode.com/problems/count-primes/ */

import java.util.Arrays;

class Solution {
    public static boolean isPrime(int n){
        for (int i=2; i<=n/2; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    // Naive Solution
    public static int countPrimeNumbers(int n){
        int count = 0;
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    // Sieve of Eratosthenes
    public int countPrimes1(int n){
        boolean[] primes = new boolean[n+1];

        // Make all the numbers true for prime
        Arrays.fill(primes,true);

        int count = 0;
        for(int i=2; i<n; i++){
            if(primes[i]){
                count++;
                for (int j=2*i; j<n; j=j+i){
                    primes[j] =false;
                }
            }
        }
        return count;
    }

    //Excellent Solution
    public int countPrimes(int n) {

        boolean[] prime = new boolean[n+1];

        for(int i = 2; i*i<=n; i++)
        {
            if(!prime[i])
            {
                for(int j = i*2; j<=n; j+=i)
                {
                    prime[j] = true;
                }
            }
        }
        int count = 0;

        for(int i = 2; i<n; i++)
        {
            if(!prime[i])
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage
        int n = 20;
        System.out.println("Count of prime numbers up to " + n + ": " + solution.countPrimes1(n));
    }
}

