public class TrialDivision {
    void trial(int n) {
        int j = (int) Math.ceil(Math.sqrt(n));
        for(int i = 2; i <= j; i++) {
            if(n % i ==0) {
                System.out.println("Not prime // Composite");
                return;
            }
        }
        System.out.println("Prime");
        return;
    }
}
