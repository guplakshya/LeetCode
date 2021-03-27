########### Count Primes #########

/*

Count the number of prime numbers less than a non-negative number, n.

 

Example:

Input: n = 10
Output: 4

Constraints:

0 <= n <= 5 * 106

*/

Java Solution:

public int countPrimes(int n) {
        boolean primes[] = new boolean[n];
        int count = 0;
         for(int i=2;i<n;i++){
             if(primes[i] == false){
                 count++;
                 for(int j=2;i*j<n;j++){
                     primes[i*j] = true;
                 }
             }
         }
        return count;
    }
