import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the sum
        int sum = firstNumber + secondNumber;

        // Print the result
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
