public class LargestPrimeFactor {
    // Main method
    public static void main(String[] args) {
        long number = 13195; // Example number
        System.out.println("The largest prime factor of " + number + " is " + largestPrimeFactor(number));
    }

    // Method to find the largest prime factor
    public static long largestPrimeFactor(long n) {
        long largestFactor = -1;

        // Divide n by 2 until it becomes odd
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors from 3 upwards
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If n is still greater than 2, then it is prime
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }
}
