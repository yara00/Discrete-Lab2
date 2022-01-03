public class ExtendedEuclidean {
    boolean done = false;
    int extended(int a, int b) {
        int x,y;
        if (a == 0)
        {
            x = 0;
            y = 1;
            return b;
        }

        int x1=1, y1=1; // To store results of recursive call
        int gcd = extended(b%a, a);

        // Update x and y using results of recursive call
        x = y1 - (b/a) * x1;
        y = x1;
        if(done == false) {
            System.out.println("s is "+x);
            System.out.println("t is "+y);
            done = true;
            }

        return gcd;

    }
}
