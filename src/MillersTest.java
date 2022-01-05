import java.math.BigInteger;
import java.util.Random;

public class MillersTest {

    // Function to check if prime or not
    public static boolean isPrime(long num, int iteration)
    {
        // base case
        if (num == 0 || num == 1)
            return false;
        // base case - 2 is prime
        if (num == 2)
            return true;
        // an even number other than 2 is composite
        if (num % 2 == 0)
            return false;

        long numMinus = num - 1;
        while (numMinus % 2 == 0)
            numMinus /= 2;

        Random rand = new Random();
        for (int i = 0; i < iteration; i++)
        {
            long r = Math.abs(rand.nextLong());
            long a = r % (num - 1) + 1, temp = numMinus;
            long mod = modPow(a, temp, num);
            while (temp != num - 1 && mod != 1 && mod != num - 1)
            {
                mod = modMult(mod, mod, num);
                temp *= 2;
            }
            if (mod != num - 1 && temp % 2 == 0)
                return false;
        }
        return true;
    }
    // Function to calculate (a ^ b) % c
    public static long modPow(long a, long b, long c)
    {
        long res = 1;
        for (int i = 0; i < b; i++)
        {
            res *= a;
            res %= c;
        }
        return res % c;
    }
    // Function to calculate (a * b) % c
    public static long modMult(long a, long b, long mod)
    {
        return BigInteger.valueOf(a).multiply(BigInteger.valueOf(b)).mod(BigInteger.valueOf(mod)).longValue();
    }

    // Function to calculate number of iterations
    public static int iterationsNum (long num) {
        int x  = 0;
        while (true) {
            //to check if the result num is integer or not
            if (num/(Math.pow(2, x)) != (int)(num/(Math.pow(2, x)))) {
                break;
            }
            x++;
        }
        return x-1 ;
    }



}
