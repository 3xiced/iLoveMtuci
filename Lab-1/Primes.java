/**
 * Class that checks first 100 numbers to be a prime number
 */
public class Primes {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    /**
     * Checks if number is prime
     * 
     * @param num String
     * @return boolean
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}
