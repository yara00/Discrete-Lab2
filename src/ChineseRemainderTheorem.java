public class ChineseRemainderTheorem {

    // method Returns the smallest number x such that:
    // x = a1 (mod m1)
    // x = a2 (mod m2)
    //  ..................
    // x= an (mod mn).

    // Assumption: Numbers in m[] are pairwise relatively prime

    static int findX(int m[], int a[], int arrSize)
    {
        int x = 1; // Initialize result

        while (true)
        {
            // Check if remainder of x % m[i] is a[i] or not (for all i from 0 to n-1)
            int i ;
            for (i = 0; i < arrSize; i++ )
                if (x % m[i] != a[i])
                    break;

            // If all remainders matched, we found x
            if (i == arrSize)
                return x;

            // Else try next number
            x++;
        }

    }

}