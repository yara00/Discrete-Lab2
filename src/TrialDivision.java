public class TrialDivision {
    void trial(int n) {
        int j = (int) Math.ceil(Math.sqrt(n));
        for(int i = 2; i <= j; i++) {
            if(n % i ==0) {
                // if n is divisible by any of the numbers then its not prime
                System.out.println("Not prime // Composite");
                return;
            }
        }
        //if return was not exectured then this number is prime
        System.out.println("Prime");
        return;
    }
}
