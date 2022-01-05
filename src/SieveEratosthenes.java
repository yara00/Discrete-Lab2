public class SieveEratosthenes {
    void sieve(int n) {
        int primeCheck[] = new int[n+1];
        //initialize all values to prime
        for(int i=0; i<=n; i++) {
            primeCheck[i] = 1;
        }
        // assign all values divisible by a nmuber in the range to 0 (not prime)
        for(int i=2; (i*i)<=n; i++) {
            if(primeCheck[i] == 1) {
                for (int j = (i*i); j<=n; j+=i)
                    primeCheck[j] = 0;
            }
        }
        // check prime numbers of value 1
        for (int i = 2; i <= n; i++) {
            if (primeCheck[i] == 1)
                System.out.print(i+ "\t");
        }
    }
}

