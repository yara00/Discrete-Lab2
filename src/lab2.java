import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\nEnter the number corresponding to the desired operation" + "\n" + "" +
                    "1. Sieve of Eratosthenes\n" +
                    "2. Trial Division\n" +
                    "3. Extended Euclidean\n"+
                    "4. Chinese Remainder Theorem\n"+
                    "5. Miller's Test\n"+
                    "6. EXIT");

            Scanner s = new Scanner(System.in);
            int operation = s.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter the limit number");
                    int n = s.nextInt();
                    SieveEratosthenes eratosthenes = new SieveEratosthenes();
                    System.out.println("Prime numbers up to " + n + " are: ");
                    eratosthenes.sieve(n);
                    break;
                case 2:
                    System.out.println("Enter the value");
                    int no = s.nextInt();
                    TrialDivision trial = new TrialDivision();
                    trial.trial(no);
                    break;
                case 3:
                    System.out.println("Enter a and b separated by a space");
                    int a = s.nextInt();
                    int b = s.nextInt();
                    ExtendedEuclidean euclidean = new ExtendedEuclidean();
                    System.out.println("GCD is "+euclidean.extended(a, b));
                    break;
                case 6:
                    System.out.println("EXIT");
                    System.exit(0);
                default:
                    System.out.println("Please enter a valid integer from 1 to 6");
            }
        }



    }
}