public class SumOfEvenNumbers {
    // Main method
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Example array
        int sum = findSumOfEvenNumbers(numbers);
        System.out.println("The sum of even numbers in the array is: " + sum);
    }

    // Method to find the sum of even numbers in an array
    public static int findSumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (number % 2 == 0) { // Check if the number is even
                sum += number;
            }
        }
        return sum;
    }
}
