public class ExtendedEuclidean {
    int extended(int a, int b) {
        int old_s =1;
        int new_s =0;
        int old_t =0;
        int new_t =1;
        int temp, q;
        while(b != 0) {
            q = a / b;
            //setting s (swap old s with new s and evaluate new s)
            temp = new_s;
            new_s = old_s - new_s * q;
            old_s = temp;
            //setting t (swap old t with new t and evaluate new t)
            temp = new_t;
            new_t = old_t - new_t * q;
            old_t = temp;
            //setting gcd
            temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        System.out.println("s is "+ old_s);
        System.out.println("t is "+ old_t);
        return  gcd;

    }
}
